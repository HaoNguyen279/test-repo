# Script PowerShell để thêm thuộc tính show vào tất cả các Entity classes
$entityPath = "e:\PTUD\nha-thuoc-pill-and-chill-java-swing\src\app\Entity\"

# Danh sách các file cần xử lý (loại trừ những file đã xử lý)
$filesToProcess = @(
    "ChiTietHoaDon.java",
    "ChiTietPhieuDat.java", 
    "ChiTietPhieuDoiTra.java",
    "ChiTietPhieuNhap.java",
    "KhuyenMai.java",
    "LoThuoc.java", 
    "NhanVien.java",
    "NhaSanXuat.java",
    "PhieuDat.java",
    "PhieuDoiTra.java", 
    "PhieuNhapThuoc.java",
    "TaiKhoan.java",
    "Thue.java"
)

foreach ($fileName in $filesToProcess) {
    $filePath = Join-Path $entityPath $fileName
    
    if (Test-Path $filePath) {
        $content = Get-Content $filePath -Raw
        
        # 1. Thêm thuộc tính show sau field cuối cùng
        $content = $content -replace '(private\s+\w+[\[\]]*\s+\w+;)\s*(\r?\n\s*\r?\n\s*public\s+\w+\s*\()', '$1${2}    private boolean show;${2}${2}'
        
        # 2. Thêm show = true vào constructor có tham số
        $content = $content -replace '(public\s+\w+\s*\([^)]+\)\s*\{[^}]*)(this\.\w+\s*=\s*\w+;\s*)(}\s*)', '$1$2        this.show = true; // Default value${3}$3'
        
        # 3. Thêm getter và setter cho show
        $showMethods = @"

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
"@
        
        # Thêm methods trước @Override hoặc toString()
        if ($content -match '@Override') {
            $content = $content -replace '(\s*)(@Override)', "$showMethods`$1`$2"
        } elseif ($content -match 'public\s+String\s+toString\s*\(\)') {
            $content = $content -replace '(\s*)(public\s+String\s+toString\s*\(\))', "$showMethods`$1`$2"
        } else {
            # Thêm trước dấu } cuối
            $content = $content -replace '(\s*)}(\s*)$', "$showMethods`$1}`$2"
        }
        
        # Ghi lại file
        Set-Content $filePath $content -Encoding UTF8
        Write-Host "Đã xử lý: $fileName"
    } else {
        Write-Host "Không tìm thấy file: $fileName"
    }
}