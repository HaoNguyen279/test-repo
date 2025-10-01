-- Script để cập nhật các câu lệnh INSERT thêm cột 'show'
-- Vì đã có DEFAULT 1 trong ALTER TABLE, dữ liệu cũ sẽ tự động có show = 1
-- Script này chỉ để minh họa cách cập nhật các câu INSERT mới

-- Cập nhật INSERT cho NhaSanXuat
/*
INSERT INTO NhaSanXuat (maNSX, tenNSX, diaChiNSX, soDienThoai, [show]) VALUES
('NSX001', N'Công ty Cổ phần Dược Hậu Giang', N'288 Bis Nguyễn Văn Cừ, P. An Hòa, Q. Ninh Kiều, Cần Thơ', '0292123456', 1),
...
*/

-- Cập nhật INSERT cho KhachHang
/*
INSERT INTO KhachHang (maKH, tenKH, soDienThoai, diemTichLuy, [show]) VALUES
('KH001', N'Nguyễn Văn An', '0901234567', 150, 1),
...
*/

-- Cập nhật INSERT cho NhanVien
/*
INSERT INTO NhanVien (maNV, tenNV, chucVu, soDienThoai, [show]) VALUES
('NV001', N'Nguyễn Thanh Tùng', N'Quản lý', '0912345678', 1),
...
*/

-- Cập nhật INSERT cho TaiKhoan
/*
INSERT INTO TaiKhoan (maNV, matKhau, [show]) VALUES
('NV001', 'password123', 1),
...
*/

-- Và tương tự cho tất cả các bảng khác...

-- LƯU Ý: Do đã có DEFAULT 1 trong cột show, 
-- việc không chỉ định giá trị show trong INSERT sẽ tự động sử dụng giá trị 1
-- Điều này có nghĩa là tất cả dữ liệu hiện tại sẽ có show = 1 (hiển thị)