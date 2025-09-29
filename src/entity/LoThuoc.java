package entity;
public class LoThuoc {
    private String maLo;
    private String maNSX;

    public LoThuoc() {
    }

    public LoThuoc(String maLo, String maNSX) {
        this.maLo = maLo;
        this.maNSX = maNSX;
    }

    public String getMaLo() {
        return maLo;
    }

    public void setMaLo(String maLo) {
        this.maLo = maLo;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    @Override
    public String toString() {
        return "LoThuoc{" +
                "maLo='" + maLo + '\'' +
                ", maNSX='" + maNSX + '\'' +
                '}';
    }
}