package Test;

public class SVCLC extends SinhVien {
    public SVCLC(String name, int nam, String diachi, int tuoi,Double hocphi,int tinchi,Double GPA){
        super(name, nam, diachi, tuoi, hocphi, tinchi, GPA);
    }

    @Override
    public String dangKyHocPhan(String loai) {
        return null;
    }

    @Override
    public double tinhhocphi(int tinchi){
        return tinchi*630000*120/100;

    }
}
