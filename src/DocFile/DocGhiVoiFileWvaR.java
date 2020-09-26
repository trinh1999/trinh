package DocFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiVoiFileWvaR {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter(new File("sv3.txt"));
            fileWriter.write("ghi du lieu ");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
//            FileReader fileReader= new FileReader(new File("Chuoi.txt"));
//            int s= fileReader.read();
//            fileReader.close();
//            System.out.println("doc ra la: "+s);
            BufferedReader bufferedReader= new BufferedReader(new FileReader (new File("Chuoi.txt")));
            String line= bufferedReader.readLine();
            System.out.println(line);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

