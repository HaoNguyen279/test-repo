package app.GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) {
        // Chuỗi kết nối JDBC
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyNhaThuoc;encrypt=false;";
        String user = "sa";      
        String password = "sapassword";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println(" Kết nối thành công tới SQL Server!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
