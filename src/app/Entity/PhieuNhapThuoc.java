package app.Entity;
import java.util.Date;

public class PhieuNhapThuoc {
    private String maPhieuNhapThuoc;
    private String maNV;
    private Date ngayNhap;

    public PhieuNhapThuoc() {
    }

    public PhieuNhapThuoc(String maPhieuNhapThuoc, String maNV, Date ngayNhap) {
        this.maPhieuNhapThuoc = maPhieuNhapThuoc;
        this.maNV = maNV;
        this.ngayNhap = ngayNhap;
    }

    public String getMaPhieuNhapThuoc() {
        return maPhieuNhapThuoc;
    }

    public void setMaPhieuNhapThuoc(String maPhieuNhapThuoc) {
        this.maPhieuNhapThuoc = maPhieuNhapThuoc;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public String toString() {
        return "PhieuNhapThuoc{" +
                "maPhieuNhapThuoc='" + maPhieuNhapThuoc + '\'' +
                ", maNV='" + maNV + '\'' +
                ", ngayNhap=" + ngayNhap +
                '}';
    }
}