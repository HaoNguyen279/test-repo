package entity;
import java.util.Date;

public class ChiTietLoThuoc {
    private String maLo;
    private String maThuoc;
    private String tenThuoc;
    private Date ngaySanXuat;
    private Date hanSuDung;
    private int soLuongTon;
    private float giaBan;
    private String donVi;
    private int soLuongToiThieu;
    private String maNSX;

    public ChiTietLoThuoc() {
    }

    public ChiTietLoThuoc(String maLo, String maThuoc, String tenThuoc, Date ngaySanXuat, Date hanSuDung, 
                          int soLuongTon, float giaBan, String donVi, int soLuongToiThieu, String maNSX) {
        this.maLo = maLo;
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
        this.soLuongTon = soLuongTon;
        this.giaBan = giaBan;
        this.donVi = donVi;
        this.soLuongToiThieu = soLuongToiThieu;
        this.maNSX = maNSX;
    }

    public String getMaLo() {
        return maLo;
    }

    public void setMaLo(String maLo) {
        this.maLo = maLo;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getSoLuongToiThieu() {
        return soLuongToiThieu;
    }

    public void setSoLuongToiThieu(int soLuongToiThieu) {
        this.soLuongToiThieu = soLuongToiThieu;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    @Override
    public String toString() {
        return "ChiTietLoThuoc{" +
                "maLo='" + maLo + '\'' +
                ", maThuoc='" + maThuoc + '\'' +
                ", tenThuoc='" + tenThuoc + '\'' +
                ", ngaySanXuat=" + ngaySanXuat +
                ", hanSuDung=" + hanSuDung +
                ", soLuongTon=" + soLuongTon +
                ", giaBan=" + giaBan +
                ", donVi='" + donVi + '\'' +
                ", soLuongToiThieu=" + soLuongToiThieu +
                ", maNSX='" + maNSX + '\'' +
                '}';
    }
}