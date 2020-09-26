package DocFile;

import java.io.*;

public class DocGhiFileVoiData {
    public static void main(String[] args) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("sv2.txt"));
            dataOutputStream.writeInt(123);
            dataOutputStream.writeByte(123);
            dataOutputStream.writeChar(123);
            dataOutputStream.close();
            System.out.println("ket thuc!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataInputStream dataInputStream= new DataInputStream(new FileInputStream("output1.txt"));
            int a = dataInputStream.readInt();
            char s= dataInputStream.readChar();
            dataInputStream.close();
            System.out.println("kieu nguyen:"+a);
            System.out.println("kieu char: "+ s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
