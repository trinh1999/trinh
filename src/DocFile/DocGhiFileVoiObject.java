package DocFile;

import vn.vccorp.adopt.test.SinhVien;

import java.io.*;
import java.util.ArrayList;

public class DocGhiFileVoiObject {
    public static void main(String[] args) {
        ArrayList<SinhVien> sinhvien= new ArrayList<>();
        SinhVien sinhvien1= new SinhVien("123","trinh1",12);
        SinhVien sinhvien2= new SinhVien("224","trung",24);
        sinhvien.add(sinhvien1);
        sinhvien.add(sinhvien2);
        try {
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("sv1.txt"));
            objectOutputStream.writeObject(sinhvien);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            ArrayList<SinhVien> sinhViens;
            ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream("sv1.txt"));
            sinhViens= (ArrayList) objectInputStream.readObject();
            System.out.println(sinhViens);
            objectInputStream.close();
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }

    }
}