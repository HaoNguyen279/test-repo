package app.Entity;
public class TaiKhoan {
    private String maNV;
    private String matKhau;

    public TaiKhoan() {
    }

    public TaiKhoan(String maNV, String matKhau) {
        this.maNV = maNV;
        this.matKhau = matKhau;
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

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "maNV='" + maNV + '\'' +
                ", matKhau='" + matKhau + '\'' +
                '}';
    }
}