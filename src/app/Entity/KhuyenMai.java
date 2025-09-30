package app.Entity;
import java.util.Date;

public class KhuyenMai {
    private String maKM;
    private float phanTramGia;
    private Date ngayApDung;
    private Date ngayKetThuc;

    public KhuyenMai() {
    }

    public KhuyenMai(String maKM, float phanTramGia, Date ngayApDung, Date ngayKetThuc) {
        this.maKM = maKM;
        this.phanTramGia = phanTramGia;
        this.ngayApDung = ngayApDung;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public float getPhanTramGia() {
        return phanTramGia;
    }

    public void setPhanTramGia(float phanTramGia) {
        this.phanTramGia = phanTramGia;
    }

    public Date getNgayApDung() {
        return ngayApDung;
    }

    public void setNgayApDung(Date ngayApDung) {
        this.ngayApDung = ngayApDung;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" +
                "maKM='" + maKM + '\'' +
                ", phanTramGia=" + phanTramGia +
                ", ngayApDung=" + ngayApDung +
                ", ngayKetThuc=" + ngayKetThuc +
                '}';
    }
}