package entity;
public class ChiTietPhieuDoiTra {
    private String maPhieuDoiTra;
    private String maThuoc;
    private int soLuong;
    private float donGia;
    private String maLo;
    private String lyDo;

    public ChiTietPhieuDoiTra() {
    }

    public ChiTietPhieuDoiTra(String maPhieuDoiTra, String maThuoc, int soLuong, float donGia, String maLo, String lyDo) {
        this.maPhieuDoiTra = maPhieuDoiTra;
        this.maThuoc = maThuoc;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.maLo = maLo;
        this.lyDo = lyDo;
    }

    public String getMaPhieuDoiTra() {
        return maPhieuDoiTra;
    }

    public void setMaPhieuDoiTra(String maPhieuDoiTra) {
        this.maPhieuDoiTra = maPhieuDoiTra;
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

    public String getMaLo() {
        return maLo;
    }

    public void setMaLo(String maLo) {
        this.maLo = maLo;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuDoiTra{" +
                "maPhieuDoiTra='" + maPhieuDoiTra + '\'' +
                ", maThuoc='" + maThuoc + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", maLo='" + maLo + '\'' +
                ", lyDo='" + lyDo + '\'' +
                '}';
    }
}