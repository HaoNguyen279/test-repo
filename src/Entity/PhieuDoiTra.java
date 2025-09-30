package entity;
import java.util.Date;

public class PhieuDoiTra {
    private String maPhieuDoiTra;
    private Date ngayDoiTra;
    private String maKH;
    private String maNV;

    public PhieuDoiTra() {
    }

    public PhieuDoiTra(String maPhieuDoiTra, Date ngayDoiTra, String maKH, String maNV) {
        this.maPhieuDoiTra = maPhieuDoiTra;
        this.ngayDoiTra = ngayDoiTra;
        this.maKH = maKH;
        this.maNV = maNV;
    }

    public String getMaPhieuDoiTra() {
        return maPhieuDoiTra;
    }

    public void setMaPhieuDoiTra(String maPhieuDoiTra) {
        this.maPhieuDoiTra = maPhieuDoiTra;
    }

    public Date getNgayDoiTra() {
        return ngayDoiTra;
    }

    public void setNgayDoiTra(Date ngayDoiTra) {
        this.ngayDoiTra = ngayDoiTra;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    @Override
    public String toString() {
        return "PhieuDoiTra{" +
                "maPhieuDoiTra='" + maPhieuDoiTra + '\'' +
                ", ngayDoiTra=" + ngayDoiTra +
                ", maKH='" + maKH + '\'' +
                ", maNV='" + maNV + '\'' +
                '}';
    }
}