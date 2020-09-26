package DocFile;

import vn.vccorp.adopt.test.SinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiVoiBuffere {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Chuoi.txt"));
            String line = bufferedReader.readLine();
            List<SinhVien> list = new ArrayList<>();
            while ((line) != null) {
                String temp[] = line.split(",");
                String ten = temp[0];
                String diaChi = temp[1];
                int tuoi = Integer.parseInt(temp[2]);
                SinhVien sinhVien = new SinhVien(diaChi, ten, tuoi);
                list.add(sinhVien);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            System.out.println(list);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Chuoi.txt",true));
//            bufferedWriter.newLine();
            bufferedWriter.append("\nDoHoangKien,HaNoi,29");
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

