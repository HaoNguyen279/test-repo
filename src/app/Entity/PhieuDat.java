package app.Entity;
import java.util.Date;

public class PhieuDat {
    private String maPhieuDat;
    private String maNV;
    private Date ngayDat;
    private String maKH;

    public PhieuDat() {
    }

    public PhieuDat(String maPhieuDat, String maNV, Date ngayDat, String maKH) {
        this.maPhieuDat = maPhieuDat;
        this.maNV = maNV;
        this.ngayDat = ngayDat;
        this.maKH = maKH;
    }

    public String getMaPhieuDat() {
        return maPhieuDat;
    }

    public void setMaPhieuDat(String maPhieuDat) {
        this.maPhieuDat = maPhieuDat;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    @Override
    public String toString() {
        return "PhieuDat{" +
                "maPhieuDat='" + maPhieuDat + '\'' +
                ", maNV='" + maNV + '\'' +
                ", ngayDat=" + ngayDat +
                ", maKH='" + maKH + '\'' +
                '}';
    }
}