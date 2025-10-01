package app.Entity;


public class NhaSanXuat {
    private String maNSX;
    private String tenNSX;
    private String diaChiNSX;
    private String soDienThoai;
    private boolean show;

    public NhaSanXuat() {
    }

    public NhaSanXuat(String maNSX, String tenNSX, String diaChiNSX, String soDienThoai) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.diaChiNSX = diaChiNSX;
        this.soDienThoai = soDienThoai;
        this.show = true; // Default value
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

    public String getDiaChiNSX() {
        return diaChiNSX;
    }

    public void setDiaChiNSX(String diaChiNSX) {
        this.diaChiNSX = diaChiNSX;
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
        return "NhaSanXuat{" +
                "maNSX='" + maNSX + '\'' +
                ", tenNSX='" + tenNSX + '\'' +
                ", diaChiNSX='" + diaChiNSX + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", show=" + show +
                '}';
    }
}