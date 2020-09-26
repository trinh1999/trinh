package BaiTapKt1.Bt6;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class HoaDon  {
    private int maHoaDon;
    private Double tongGia;
    private Date ngayMua;
    List<MatHang> matHangList= new ArrayList<>();
    private int maNVBanHang;
    private int maKH;
    NVBanHang nvBanHang;
    KhachHang khachHang;

    public HoaDon(int maHoaDon, Double tongGia, Date ngayMua, List<MatHang> matHangList, int maNVBanHang, int maKH) {
        this.maHoaDon = maHoaDon;
        this.tongGia = tongGia;
        this.ngayMua = ngayMua;
        this.matHangList = matHangList;
        this.maNVBanHang = nvBanHang.getMaNV();
        this.maKH = khachHang.getMaKhachHang();
    }

}
