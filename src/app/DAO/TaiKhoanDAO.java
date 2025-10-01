package app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import app.Entity.TaiKhoan;
import app.ConnectDB.ConnectDB;

public class TaiKhoanDAO {

    public TaiKhoanDAO() {
    }

    // Lấy danh sách tài khoản (chỉ show = 1)
    public ArrayList<TaiKhoan> getListTaiKhoan() {
        ArrayList<TaiKhoan> dsTK = new ArrayList<>();
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE show = 1";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String maNV = rs.getString("maNV");
                String matKhau = rs.getString("matKhau");
                boolean show = rs.getBoolean("show");

                TaiKhoan tk = new TaiKhoan(maNV, matKhau);
                tk.setShow(show);
                dsTK.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsTK;
    }

    // Lấy 1 tài khoản theo mã NV
    public TaiKhoan getTaiKhoan(String maNV) {
        TaiKhoan tk = null;
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE maNV = ? AND show = 1";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, maNV);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String matKhau = rs.getString("matKhau");
                boolean show = rs.getBoolean("show");

                tk = new TaiKhoan(maNV, matKhau);
                tk.setShow(show);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }

    // Tạo tài khoản mới
    public boolean create(TaiKhoan tk) {
        int n = 0;
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "INSERT INTO TaiKhoan(maNV, matKhau, show) VALUES(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, tk.getMaNV());
            stmt.setString(2, tk.getMatKhau());
            stmt.setBoolean(3, tk.isShow());

            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Cập nhật mật khẩu
    public boolean update(TaiKhoan tk) {
        int n = 0;
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "UPDATE TaiKhoan SET matKhau=?, show=? WHERE maNV=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, tk.getMatKhau());
            stmt.setBoolean(2, tk.isShow());
            stmt.setString(3, tk.getMaNV());

            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Xóa mềm (ẩn tài khoản)
    public boolean delete(String maNV) {
        int n = 0;
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "UPDATE TaiKhoan SET show = 0 WHERE maNV = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, maNV);

            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Hàm đăng nhập (check tài khoản & mật khẩu)
    public boolean login(String maNV, String matKhau) {
        boolean result = false;
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE maNV=? AND matKhau=? AND show=1";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, maNV);
            stmt.setString(2, matKhau);

            ResultSet rs = stmt.executeQuery();
            result = rs.next(); // nếu có bản ghi => đăng nhập thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
