package Test;

public class SVTaiNang extends SinhVien {
    private boolean hocbong;

    public SVTaiNang(String name, int nam, String diachi, int tuoi,Double hocphi,int tinchi,Double GPA,boolean hocbong){
        super(name, nam, diachi, tuoi, hocphi, tinchi, GPA);
        this.hocbong=hocbong;
    }

    public boolean getHocbong() {
        return hocbong;
    }

    public void setHocbong(boolean hocbong) {
        this.hocbong = hocbong;
    }
    @Override
    public double tinhhocphi(int tinchi) {
        if (hocbong == true) {
            return tinchi * 630000 * 60 / 100;
        }
        return 0;
    }

    @Override
    public String dangKyHocPhan(String loai) {
        if(loai.equals("sinhvientainang")) return (" Đăng kí học cho sinh viên lớp tai năng");
    return "";
    }

    public String dangKyHocPhan(double loai,String abc){
        return "";
    }

}
