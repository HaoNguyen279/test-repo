package app.Entity;
public class ChiTietPhieuNhap {
    private String maPhieuNhapThuoc;
    private String maLo;
    private int soLuong;
    private float donGia;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(String maPhieuNhapThuoc, String maLo, int soLuong, float donGia) {
        this.maPhieuNhapThuoc = maPhieuNhapThuoc;
        this.maLo = maLo;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaPhieuNhapThuoc() {
        return maPhieuNhapThuoc;
    }

    public void setMaPhieuNhapThuoc(String maPhieuNhapThuoc) {
        this.maPhieuNhapThuoc = maPhieuNhapThuoc;
    }

    public String getMaLo() {
        return maLo;
    }

    public void setMaLo(String maLo) {
        this.maLo = maLo;
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
        return "ChiTietPhieuNhap{" +
                "maPhieuNhapThuoc='" + maPhieuNhapThuoc + '\'' +
                ", maLo='" + maLo + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}