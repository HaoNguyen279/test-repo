package app.Entity;
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String chucVu;
    private String soDienThoai;
    private boolean show;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String chucVu, String soDienThoai) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.soDienThoai = soDienThoai;
        this.show = true; // Default value
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", chucVu='" + chucVu + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
}