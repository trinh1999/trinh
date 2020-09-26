package BaiTapKt1.Bt6;

public class KhachHang {
    private int maKhachHang;
    private String gioiTinh;
    private int tuoi;

    public KhachHang(int maKhachHang, String gioiTinh, int tuoi) {
        this.maKhachHang = maKhachHang;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
