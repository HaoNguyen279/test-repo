package app.Entity;
import java.util.Date;

public class KhuyenMai {
    private String maKM;
    private float mucGiamGia;
    private Date ngayApDung;
    private Date ngayKetThuc;
    private boolean show;

    public KhuyenMai() {
    }

    public KhuyenMai(String maKM, float mucGiamGia, Date ngayApDung, Date ngayKetThuc) {
        this.maKM = maKM;
        this.mucGiamGia = mucGiamGia;
        this.ngayApDung = ngayApDung;
        this.ngayKetThuc = ngayKetThuc;
        this.show = true; // Default value
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public float getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(float mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
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

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" +
                "maKM='" + maKM + '\'' +
                ", mucGiamGia=" + mucGiamGia +
                ", ngayApDung=" + ngayApDung +
                ", ngayKetThuc=" + ngayKetThuc +
                ", show=" + show +
                '}';
    }
}