package Test;

public class SVThuong extends SinhVien {
    public SVThuong(String name, int nam, String diachi, int tuoi,Double hocphi,int tinchi,Double GPA){
        super(name, nam, diachi, tuoi, hocphi, tinchi, GPA);
    }
    @Override
    public double tinhhocphi(int tinchi){
        return  tinchi*630.000*80/100;
    }

    @Override
    public String dangKyHocPhan(String loai) {
        return null;
    }
}
