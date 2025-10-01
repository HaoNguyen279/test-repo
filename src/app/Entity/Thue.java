package app.Entity;
import java.util.Date;

public class Thue {
    private String maThue;
    private float mucThue;
    private Date ngayKetThuc;
    private Date ngayApDung;
    private boolean show;

    public Thue() {
    }

    public Thue(String maThue, float mucThue, Date ngayKetThuc, Date ngayApDung) {
        this.maThue = maThue;
        this.mucThue = mucThue;
        this.ngayKetThuc = ngayKetThuc;
        this.ngayApDung = ngayApDung;
        this.show = true; // Default value
    }

    public String getMaThue() {
        return maThue;
    }

    public void setMaThue(String maThue) {
        this.maThue = maThue;
    }

    public float getMucThue() {
        return mucThue;
    }

    public void setMucThue(float mucThue) {
        this.mucThue = mucThue;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Date getNgayApDung() {
        return ngayApDung;
    }

    public void setNgayApDung(Date ngayApDung) {
        this.ngayApDung = ngayApDung;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "Thue{" +
                "maThue='" + maThue + '\'' +
                ", mucThue=" + mucThue +
                ", ngayKetThuc=" + ngayKetThuc +
                ", ngayApDung=" + ngayApDung +
                '}';
    }
}