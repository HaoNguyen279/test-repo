package app.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import app.Entity.*;
import app.ConnectDB.ConnectDB;

public class NhanVienDAO {
	ArrayList<NhanVien> dsnv;
	NhanVien nv;
	public NhanVienDAO() {
		dsnv = new ArrayList<NhanVien>();
		nv = new NhanVien();
	}
	
	public ArrayList<NhanVien> getListNhanVien(){
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM NhanVien";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String manv = rs.getString(1);
                String tennv = rs.getString(2);
                String chucvu = rs.getString(3);
                String sdt = rs.getString(4);
                
                NhanVien nv1 = new NhanVien(manv, tennv, chucvu, sdt);
                dsnv.add(nv1);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsnv;
	}
	
	public NhanVien getNhanVien(String manv) {
    	try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            
            String sql = "SELECT * FROM NhanVien where maNV = ?";
            PreparedStatement statement = null;
            statement = con.prepareStatement(sql);  
            statement.setString(1, manv);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
            	String manv1 = rs.getString(1);
                String tennv = rs.getString(2);
                String chucvu = rs.getString(3);
                String sdt = rs.getString(4);
                nv = new NhanVien(manv1, tennv, chucvu, sdt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }
    
    public boolean update(NhanVien nv){
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n =0 ;
        try {
        	stmt = con.prepareStatement("update NhanVien set TenNV=?,NgaySinh=?,NgayVaoLam=?,ChucVu=? where MaNV=?");
        	stmt.setString(1, nv.getTenNV());
        	stmt.setString(2,nv.getChucVu());
        	stmt.setString(3, nv.getSoDienThoai());
        	stmt.setString(4, nv.getMaNV());

        	n = stmt.executeUpdate();
        }catch (SQLException e) {
			e.printStackTrace();
		}
   
        return n>0;	
    }

    public boolean create(NhanVien nv) throws SQLException{
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        stmt = con.prepareStatement("insert into" +" NhanVien values(?,?,?,?,?)");
        stmt.setString(1, nv.getMaNV());
        stmt.setString(2, nv.getTenNV());
        stmt.setString(3, nv.getChucVu());
        stmt.setString(4, nv.getSoDienThoai());

        n =stmt.executeUpdate();

        return n>0;
	}
    
    
    // Viết lại hàm delete với update thuộc tính ẩn
//	public boolean delete(String manv){
//		
//	    ConnectDB.getInstance();
//	    Connection con = ConnectDB.getConnection();
//	    PreparedStatement stmt = null;
//	    int n = 0;
//	    try {
//	    	ConnectDB.getInstance().connect();
//			NhanVien dao = new NhanVien();
//			stmt = con.prepareStatement("delete from NhanVien where MaNV = ?");
//			stmt.setString(1, manv);
//			n = stmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	    return n>0;
//	}
	
}
