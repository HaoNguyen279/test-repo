package app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;

import app.Entity.Thue;
import app.ConnectDB.ConnectDB;

public class ThueDAO {
    ArrayList<Thue> dsThue;
    Thue thue;

    public ThueDAO() {
        dsThue = new ArrayList<Thue>();
        thue = new Thue();
    }

    public ArrayList<Thue> getListThue() {
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM Thue WHERE show = 1";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String maThue = rs.getString("maThue");
                float mucThue = rs.getFloat("mucThue");
                Date ngayKetThuc = rs.getDate("ngayKetThuc");
                Date ngayApDung = rs.getDate("ngayApDung");
                boolean show = rs.getBoolean("show");

                Thue t = new Thue(maThue, mucThue, ngayKetThuc, ngayApDung);
                t.setShow(show);
                dsThue.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsThue;
    }

    public Thue getThue(String maThue) {
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM Thue WHERE maThue = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, maThue);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                float mucThue = rs.getFloat("mucThue");
                Date ngayKetThuc = rs.getDate("ngayKetThuc");
                Date ngayApDung = rs.getDate("ngayApDung");
                boolean show = rs.getBoolean("show");
                thue = new Thue(maThue, mucThue, ngayKetThuc, ngayApDung);
                thue.setShow(show);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return thue;
    }

    public boolean create(Thue t) throws SQLException {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        stmt = con.prepareStatement("INSERT INTO Thue(maThue, mucThue, ngayKetThuc, ngayApDung, show) VALUES(?,?,?,?,?)");
        stmt.setString(1, t.getMaThue());
        stmt.setFloat(2, t.getMucThue());
        stmt.setDate(3, new java.sql.Date(t.getNgayKetThuc().getTime()));
        stmt.setDate(4, new java.sql.Date(t.getNgayApDung().getTime()));
        stmt.setBoolean(5, t.isShow());

        n = stmt.executeUpdate();

        return n > 0;
    }

    public boolean update(Thue t) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("UPDATE Thue SET mucThue=?, ngayKetThuc=?, ngayApDung=?, show=? WHERE maThue=?");
            stmt.setFloat(1, t.getMucThue());
            stmt.setDate(2, new java.sql.Date(t.getNgayKetThuc().getTime()));
            stmt.setDate(3, new java.sql.Date(t.getNgayApDung().getTime()));
            stmt.setBoolean(4, t.isShow());
            stmt.setString(5, t.getMaThue());
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    public boolean delete(String maThue) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("UPDATE Thue SET show = 0 WHERE maThue = ?");
            stmt.setString(1, maThue);
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }
}
