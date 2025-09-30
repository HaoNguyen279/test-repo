package app.Entity;


public class NhaSanXuat {
    private String maNSX;
    private String tenNSX;
    private String diaChi;
    private String soDienThoai;

    public NhaSanXuat() {
    }

    public NhaSanXuat(String maNSX, String tenNSX, String diaChi, String soDienThoai) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "NhaSanXuat{" +
                "maNSX='" + maNSX + '\'' +
                ", tenNSX='" + tenNSX + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
}