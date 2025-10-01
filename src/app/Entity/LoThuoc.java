package app.Entity;
public class LoThuoc {
    private String maLo;
    private String maNSX;
    private boolean show;

    public LoThuoc() {
    }

    public LoThuoc(String maLo, String maNSX) {
        this.maLo = maLo;
        this.maNSX = maNSX;
        this.show = true; // Default value
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

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "LoThuoc{" +
                "maLo='" + maLo + '\'' +
                ", maNSX='" + maNSX + '\'' +
                '}';
    }
}