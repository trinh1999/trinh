package vn.vccorp.adopt.test;

import java.io.Serializable;
import java.util.Objects;
//public class SinhVien implements Serializable
//public class SinhVien implements Comparable<SinhVien>
public class SinhVien implements Comparable<SinhVien>{
    String address;
    String name;
    int tuoi;

    public SinhVien(String address, String name, int tuoi) {
        this.address = address;
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.getName().compareTo(o.getName());
    }
}

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SinhVien sinhVien = (SinhVien) o;
//        return Objects.equals(address, sinhVien.address) &&
//                Objects.equals(name, sinhVien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(address, name);
//    }
//
//    public static void main(String[] args) {
//        SinhVien sinhVien= new SinhVien("Ha Noi","Cong");
//        SinhVien sinhVien1= new SinhVien("Ha Noi","Cong");
//        SinhVien sinhVien2= new SinhVien("Ha Noi1","Cong");
//
//        System.out.println(sinhVien.hashCode());
//        System.out.println(sinhVien1.hashCode());
//        System.out.println(sinhVien2.hashCode());
//
//    }
//}
