package vn.vccorp.adopt.test;

import java.util.*;

public class SapXepObject {
    public static void main(String[] args) {
        List<SinhVien> sinhVienList= new ArrayList<>();
        SinhVien sv1 = new SinhVien("123","t1",21);
        SinhVien sv2= new SinhVien("334","t2",23);
        SinhVien sv3= new SinhVien("274","t1",25);
        SinhVien sv4 =new SinhVien("213","t3",32);
        sinhVienList.add(sv1);
        sinhVienList.add(sv2);
        sinhVienList.add(sv3);
        sinhVienList.add(sv4);
//        Set<SinhVien> sinhVienTreeSet= new TreeSet<>();
//        SinhVien sv1 = new SinhVien("123","t1",21);
//        SinhVien sv2= new SinhVien("334","t2",23);
//        SinhVien sv3= new SinhVien("274","t1",25);
//        SinhVien sv4 =new SinhVien("213","t3",32);
//        sinhVienTreeSet.add(sv1);
//        sinhVienTreeSet.add(sv2);
//        sinhVienTreeSet.add(sv3);
//        sinhVienTreeSet.add(sv4);



        Collections.sort(sinhVienList);
        for (SinhVien sv: sinhVienList) {
            System.out.println(sv);
        }
//        sinhVienTreeSet.forEach(System.out::println);
//        System.out.println(sinhVienTreeSet);

    }
}
