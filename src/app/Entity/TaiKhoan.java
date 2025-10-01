package app.Entity;
public class TaiKhoan {
    private String maNV;
    private String matKhau;
    private boolean show;

    public TaiKhoan() {
    }

    public TaiKhoan(String maNV, String matKhau) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.show = true; // Default value
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "maNV='" + maNV + '\'' +
                ", matKhau='" + matKhau + '\'' +
                '}';
    }
}