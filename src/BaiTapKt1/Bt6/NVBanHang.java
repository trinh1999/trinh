package BaiTapKt1.Bt6;

import java.util.Date;

public class NVBanHang {
    private int maNV;
    private String gioiTinh;
    private Date ngayLamViec;
    private String caDK;

    public NVBanHang(int maNV, String gioiTinh, Date ngayLamViec, String caDK) {
        this.maNV = maNV;
        this.gioiTinh = gioiTinh;
        this.ngayLamViec = ngayLamViec;
        this.caDK = caDK;
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

    public String getCaDK() {
        return caDK;
    }

    public void setCaDK(String caDK) {
        this.caDK = caDK;
    }
}
