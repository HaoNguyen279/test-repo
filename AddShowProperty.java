import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

public class AddShowProperty {
    public static void main(String[] args) {
        String entityDir = "e:\\PTUD\\nha-thuoc-pill-and-chill-java-swing\\src\\app\\Entity\\";
        
        String[] entityFiles = {
            "ChiTietHoaDon.java",
            "ChiTietPhieuDat.java", 
            "ChiTietPhieuDoiTra.java",
            "ChiTietPhieuNhap.java",
            "HoaDon.java",
            "KhuyenMai.java",
            "LoThuoc.java", 
            "NhanVien.java",
            "NhaSanXuat.java",
            "PhieuDat.java",
            "PhieuDoiTra.java", 
            "PhieuNhapThuoc.java",
            "TaiKhoan.java",
            "Thue.java",
            "Thuoc.java"
        };
        
        for (String fileName : entityFiles) {
            try {
                processFile(entityDir + fileName);
                System.out.println("Processed: " + fileName);
            } catch (Exception e) {
                System.err.println("Error processing " + fileName + ": " + e.getMessage());
            }
        }
    }
    
    private static void processFile(String filePath) throws IOException {
        String content = Files.readString(Paths.get(filePath));
        
        // Add show property after last private field
        Pattern lastFieldPattern = Pattern.compile("(private\\s+\\w+\\s+\\w+;)\\s*\\n(\\s*\\n\\s*public\\s+\\w+\\s*\\()", Pattern.MULTILINE);
        content = lastFieldPattern.matcher(content).replaceFirst("$1\\n    private boolean show;\\n\\n$2");
        
        // Add show = true to constructor with parameters
        Pattern constructorPattern = Pattern.compile("(public\\s+\\w+\\s*\\([^)]+\\)\\s*\\{[^}]+)(\\s*\\})");
        Matcher matcher = constructorPattern.matcher(content);
        if (matcher.find()) {
            String constructorBody = matcher.group(1);
            if (!constructorBody.contains("this.show")) {
                content = matcher.replaceFirst(constructorBody + "\\n        this.show = true; // Default value\\n    $2");
            }
        }
        
        // Add getter and setter methods before toString or at the end
        String showMethods = "\\n    public boolean isShow() {\\n        return show;\\n    }\\n\\n    public void setShow(boolean show) {\\n        this.show = show;\\n    }\\n";
        
        if (content.contains("@Override")) {
            content = content.replaceFirst("(\\s*)(@Override)", showMethods + "$1$2");
        } else if (content.contains("toString()")) {
            content = content.replaceFirst("(\\s*)(public\\s+String\\s+toString\\(\\))", showMethods + "$1$2");
        } else {
            // Add before the last closing brace
            content = content.replaceFirst("(\\s*)}\\s*$", showMethods + "$1}");
        }
        
        Files.writeString(Paths.get(filePath), content);
    }
}