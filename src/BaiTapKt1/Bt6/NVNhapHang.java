package BaiTapKt1.Bt6;

import java.util.Date;

public class NVNhapHang {
    private int maNV;
    private String gioiTinh;
    private Date ngayLamViec;
    private String thamNien;

    public NVNhapHang(int maNV, String gioiTinh, Date ngayLamViec, String thamNien) {
        this.maNV = maNV;
        this.gioiTinh = gioiTinh;
        this.ngayLamViec = ngayLamViec;
        this.thamNien = thamNien;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public String getThamNien() {
        return thamNien;
    }

    public void setThamNien(String thamNien) {
        this.thamNien = thamNien;
    }
}
