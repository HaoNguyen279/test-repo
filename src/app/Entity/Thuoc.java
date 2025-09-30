package app.Entity;
public class Thuoc {
    private String maThuoc;
    private String maLo;
    private String tenThuoc;
    private int soLuongTon;

    public Thuoc() {
    }

    public Thuoc(String maThuoc, String maLo, String tenThuoc, int soLuongTon) {
        this.maThuoc = maThuoc;
        this.maLo = maLo;
        this.tenThuoc = tenThuoc;
        this.soLuongTon = soLuongTon;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getMaLo() {
        return maLo;
    }

    public void setMaLo(String maLo) {
        this.maLo = maLo;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    @Override
    public String toString() {
        return "Thuoc{" +
                "maThuoc='" + maThuoc + '\'' +
                ", maLo='" + maLo + '\'' +
                ", tenThuoc='" + tenThuoc + '\'' +
                ", soLuongTon=" + soLuongTon +
                '}';
    }
}