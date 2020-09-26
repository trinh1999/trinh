package BaiTapKt1.Bt6;

public class MatHang {
   private int maHangHoa;
   private String tenHangHoa;
   private String PhanLoai;
   private Double gia;

    public MatHang(int maHangHoa, String tenHangHoa, String phanLoai, Double gia) {
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        PhanLoai = phanLoai;
        this.gia = gia;
    }

    public int getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(int maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getPhanLoai() {
        return PhanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        PhanLoai = phanLoai;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
}
