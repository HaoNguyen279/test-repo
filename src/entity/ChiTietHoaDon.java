package entity;
public class ChiTietHoaDon {
    private String maHoaDon;
    private String maThuoc;
    private int soLuong;
    private float donGia;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String maHoaDon, String maThuoc, int soLuong, float donGia) {
        this.maHoaDon = maHoaDon;
        this.maThuoc = maThuoc;
        this.soLuong = soLuong;
        this.donGia = donGia;
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