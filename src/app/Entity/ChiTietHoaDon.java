package app.Entity;

public class ChiTietHoaDon {
    private String maHoaDon;
    private String maThuoc;
    private int soLuong;
    private float donGia;
    private boolean show;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String maHoaDon, String maThuoc, int soLuong, float donGia) {
        this.maHoaDon = maHoaDon;
        this.maThuoc = maThuoc;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.show = true; // Default value
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maThuoc='" + maThuoc + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}