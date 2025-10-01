package app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import app.Entity.Thuoc;
import app.ConnectDB.ConnectDB;

public class ThuocDAO {

    public ThuocDAO() {
    }

    // Lấy toàn bộ thuốc (chỉ lấy show = 1)
    public ArrayList<Thuoc> getListThuoc() {
        ArrayList<Thuoc> dsthuoc = new ArrayList<>();
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM Thuoc WHERE show = 1";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String maThuoc = rs.getString("maThuoc");
                String maLo = rs.getString("maLo");
                String tenThuoc = rs.getString("tenThuoc");
                int soLuongTon = rs.getInt("soLuongTon");
                boolean show = rs.getBoolean("show");

                Thuoc t = new Thuoc(maThuoc, maLo, tenThuoc, soLuongTon);
                t.setShow(show);
                dsthuoc.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsthuoc;
    }

    // Lấy 1 thuốc theo mã
    public Thuoc getThuoc(String maThuoc) {
        Thuoc thuoc = null;
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM Thuoc WHERE maThuoc = ? AND show = 1";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, maThuoc);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String maLo = rs.getString("maLo");
                String tenThuoc = rs.getString("tenThuoc");
                int soLuongTon = rs.getInt("soLuongTon");
                boolean show = rs.getBoolean("show");

                thuoc = new Thuoc(maThuoc, maLo, tenThuoc, soLuongTon);
                thuoc.setShow(show);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return thuoc;
    }

    // Thêm thuốc mới
    public boolean create(Thuoc t) {
        int n = 0;
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "INSERT INTO Thuoc(maThuoc, maLo, tenThuoc, soLuongTon, show) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getMaThuoc());
            stmt.setString(2, t.getMaLo());
            stmt.setString(3, t.getTenThuoc());
            stmt.setInt(4, t.getSoLuongTon());
            stmt.setBoolean(5, t.isShow());

            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Cập nhật thuốc
    public boolean update(Thuoc t) {
        int n = 0;
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "UPDATE Thuoc SET maLo=?, tenThuoc=?, soLuongTon=?, show=? WHERE maThuoc=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getMaLo());
            stmt.setString(2, t.getTenThuoc());
            stmt.setInt(3, t.getSoLuongTon());
            stmt.setBoolean(4, t.isShow());
            stmt.setString(5, t.getMaThuoc());

            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Xóa mềm (ẩn thuốc: set show = false)
    public boolean delete(String maThuoc) {
        int n = 0;
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "UPDATE Thuoc SET show = 0 WHERE maThuoc = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, maThuoc);

            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }
}
