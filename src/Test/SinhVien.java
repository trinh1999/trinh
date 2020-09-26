package Test;

public abstract class SinhVien extends Nguoi {
    private Double hocphi;
    private int tinchi;
    private Double GPA;

    public SinhVien(String name, int nam, String diachi, int tuoi,Double hocphi,int tinchi,Double GPA){
        super(name, nam, diachi, tuoi);
        this.hocphi=hocphi;
        this.tinchi=tinchi;
        this.GPA=GPA;
    }

    public abstract String dangKyHocPhan(String loai);
    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public int getTinchi() {
        return tinchi;
    }

    public void setTinchi(int tinchi) {
        this.tinchi = tinchi;
    }

    public Double getHocphi() {
        return hocphi;
    }

    public void setHocphi(Double hocphi) {
        this.hocphi = hocphi;
    }
    public abstract double tinhhocphi(int tinchi);

    @Override
    public void tinhtuoi(int tuoi) {
         super.setTuoi(2020 - super.getNam());
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hocphi=" + hocphi +
                ", tinchi=" + tinchi +
                ", GPA=" + GPA +
                '}';
    }
}
