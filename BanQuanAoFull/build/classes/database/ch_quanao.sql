-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 19, 2023 lúc 06:16 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ch_quanao`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cthd`
--

CREATE TABLE `cthd` (
  `MaHd` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaHang` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DonGiaCTHD` double NOT NULL,
  `SoLuong` int(10) NOT NULL,
  `ThanhTienCTHD` double NOT NULL,
  `TienGGCTHD` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `cthd`
--

INSERT INTO `cthd` (`MaHd`, `MaHang`, `DonGiaCTHD`, `SoLuong`, `ThanhTienCTHD`, `TienGGCTHD`) VALUES
('HD001', 'HANG1', 80000, 5, 400000, 0),
('HD001', 'HANG9', 600000, 4, 2400000, 0),
('HD002', 'HANG1', 80000, 2, 160000, 24000),
('HD002', 'HANG4', 100000, 1, 100000, 15000),
('HD003', 'HANG10', 60000, 3, 180000, 0),
('HD003', 'HANG4', 100000, 2, 200000, 10000),
('HD004', 'HANG1', 80000, 6, 480000, 48000),
('HD004', 'HANG2', 150000, 2, 300000, 0),
('HD005', 'HANG6', 350000, 4, 1400000, 0),
('HD006', 'HANG1', 80000, 3, 240000, 0),
('HD006', 'HANG4', 100000, 2, 200000, 0),
('HD006', 'HANG5', 150000, 3, 450000, 0),
('HD007', 'HANG10', 60000, 3, 180000, 27000),
('HD007', 'HANG3', 50000, 4, 200000, 50000),
('HD007', 'HANG8', 450000, 7, 3150000, 472500),
('HD008', 'HANG4', 100000, 1, 100000, 0),
('HD009', 'HANG2', 150000, 3, 450000, 45000),
('HD009', 'HANG6', 350000, 3, 1050000, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ctkm`
--

CREATE TABLE `ctkm` (
  `MaKm` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaHang` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PhanTramGGCT` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `ctkm`
--

INSERT INTO `ctkm` (`MaKm`, `MaHang`, `PhanTramGGCT`) VALUES
('KM001', 'HANG3', 0.1),
('KM001', 'HANG5', 0.15),
('KM002', 'HANG8', 0.15),
('KM002', 'HANG9', 0.1),
('KM003', 'HANG1', 0.1),
('KM003', 'HANG4', 0.05),
('KM004', 'HANG10', 0.1),
('KM004', 'HANG6', 0.05),
('KM005', 'HANG10', 0.02),
('KM005', 'HANG2', 0.1),
('KM005', 'HANG7', 0.05);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ctpn`
--

CREATE TABLE `ctpn` (
  `MaPn` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaHang` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DonGiaPn` double NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `ThanhTienCTPn` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `ctpn`
--

INSERT INTO `ctpn` (`MaPn`, `MaHang`, `DonGiaPn`, `SoLuong`, `ThanhTienCTPn`) VALUES
('PN001', 'HANG1', 50000, 30, 1500000),
('PN001', 'HANG10', 30000, 20, 600000),
('PN002', 'HANG6', 250000, 100, 25000000),
('PN003', 'HANG8', 300000, 10, 3000000),
('PN004', 'HANG4', 30000, 90, 2700000),
('PN005', 'HANG7', 50000, 10, 500000),
('PN006', 'HANG7', 70000, 30, 2100000),
('PN007', 'HANG9', 100000, 6, 600000),
('PN008', 'HANG3', 57000, 4, 228000),
('PN009', 'HANG3', 100000, 21, 2100000),
('PN010', 'HANG1', 40000, 1, 40000),
('PN010', 'HANG3', 20000, 2, 40000),
('PN010', 'HANG4', 50000, 2, 100000),
('PN010', 'HANG5', 60000, 4, 240000),
('PN011', 'HANG3', 20000, 6, 120000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHd` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaNv` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaKh` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaKm` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayXuat` date NOT NULL,
  `TongTien` double NOT NULL,
  `TienGGHd` double NOT NULL,
  `ThanhTienHd` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`MaHd`, `MaNv`, `MaKh`, `MaKm`, `NgayXuat`, `TongTien`, `TienGGHd`, `ThanhTienHd`) VALUES
('HD001', 'NV001', 'KH001', 'KM004', '2023-05-20', 2800000, 0, 1002250),
('HD002', 'NV003', 'KH004', 'KM001', '2023-05-20', 260000, 39000, 221000),
('HD003', 'NV002', 'KH002', 'KM003', '2023-05-20', 380000, 10000, 370000),
('HD004', 'NV002', 'KH002', 'KM003', '2023-05-20', 780000, 48000, 732000),
('HD005', 'NV004', 'KH002', 'KM005', '2023-06-01', 1400000, 0, 1400000),
('HD006', 'NV002', 'KH005', 'KM004', '2023-05-21', 890000, 0, 890000),
('HD007', 'NV003', 'KH001', 'KM001', '2023-05-22', 3530000, 549500, 2980500),
('HD008', 'NV003', 'KH004', 'KM004', '2023-05-22', 100000, 0, 100000),
('HD009', 'NV004', 'KH003', 'KM005', '2023-05-20', 1500000, 45000, 1455000),
('HD010', 'NV001', 'KH002', 'KM004', '2023-05-22', 1540000, 77000, 1463000),
('HD011', 'NV002', 'KH001', 'KM001', '2023-06-18', 591000, 88650, 502350),
('HD012', 'NV003', 'KH001', 'KM002', '2023-04-26', 784000, 78400, 705600),
('HD013', 'NV004', 'KH003', 'KM004', '2023-06-25', 484000, 24200, 459800),
('HD014', 'NV001', 'KH009', 'KM001', '2023-06-10', 150000, 0, 150000),
('HD015', 'NV001', 'KH005', 'KM002', '2023-06-05', 1380000, 0, 1380000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKh` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `HoKh` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenKh` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Sdt` varchar(11) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiaChiKh` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`MaKh`, `HoKh`, `TenKh`, `Sdt`, `DiaChiKh`) VALUES
('KH001', 'Nguyễn', 'Văn A', '09111111111', '273 An Dương Vương P3 Q5 TPHCM'),
('KH002', 'Lê', 'Thị A', '0371111111', '275 An Dương Vương P3 Q5 TPHCM\r\n'),
('KH003', 'Võ ', 'Văn N', '034555555', '74 Phạm Hùng P9 Q8 TPHCM'),
('KH004', 'Trần', 'Thị N', '0217777777', '45 Ba Đình Hà Nội'),
('KH005', 'Nguyễn', 'Văn M', '0654211111', '580 Hưng Phú P9 Q8'),
('KH006', 'Trần', 'Bội Thư', '0908843432', '331 lê hồng phong'),
('KH007', 'Lâm', 'Văn Bền', '0944534343', '266 Cao Đạt'),
('KH008', 'Trần', 'Văn Tèo', '0123456789', 'abc xyz'),
('KH009', 'Lê', 'Ngọc Minh', '0123456678', 'SBABV');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khuyenmai`
--

CREATE TABLE `khuyenmai` (
  `MaKm` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenCT` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `LoaiCT` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayBDKM` date NOT NULL,
  `NgayKTKM` date NOT NULL,
  `PhanTramGG` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khuyenmai`
--

INSERT INTO `khuyenmai` (`MaKm`, `TenCT`, `LoaiCT`, `NgayBDKM`, `NgayKTKM`, `PhanTramGG`) VALUES
('KM000', 'Không khuyến mãi', 'Không', '2023-04-01', '2023-05-30', 0),
('KM001', 'Khuyến mãi tuần vàng', 'Khuyến mãi theo mặt hàng ', '2023-05-17', '2023-05-23', 0.15),
('KM002', 'Khuyến mãi dịp lễ', 'Khuyến mãi theo mặt hàng ', '2023-04-28', '2023-05-12', 0.1),
('KM003', 'Khuyến mãi chào hè', 'Khuyến mãi theo mặt hàng ', '2023-06-01', '2023-06-15', 0.05),
('KM004', 'Khuyến mãi cho hssv', 'Khuyến mãi theo thời gian', '2023-05-24', '2023-05-31', 0.05),
('KM005', 'Khuyến mãi Tuần đầu tiên của tháng', 'Khuyến mãi theo thời gian', '2023-06-16', '2023-06-23', 0.15);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaihang`
--

CREATE TABLE `loaihang` (
  `MaLoai` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenLoai` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loaihang`
--

INSERT INTO `loaihang` (`MaLoai`, `TenLoai`) VALUES
('LOAI1', 'Quần Jean'),
('LOAI10', 'Áo len'),
('LOAI2', 'Quần Tây'),
('LOAI3', 'Áo thun'),
('LOAI4', 'Quần kaki'),
('LOAI5', 'Áo so mi\r\n'),
('LOAI6', 'Áo khoác'),
('LOAI7', 'Quần đùi\r\n'),
('LOAI8', 'Quần lót\r\n'),
('LOAI9', 'Áo lót');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `login`
--

CREATE TABLE `login` (
  `MaNv` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Password` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `login`
--

INSERT INTO `login` (`MaNv`, `Password`) VALUES
('NV001', 'DUYTAN'),
('NV002', '123456'),
('NV003', '123456'),
('NV004', '123456'),
('NV005', '123456');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `mathang`
--

CREATE TABLE `mathang` (
  `MaHang` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaNcc` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaLoai` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenLoai` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DonGia` double NOT NULL,
  `SoLuong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `mathang`
--

INSERT INTO `mathang` (`MaHang`, `MaNcc`, `MaLoai`, `TenLoai`, `DonGia`, `SoLuong`) VALUES
('HANG1', 'NCC1', 'LOAI3', 'Áo thun', 80000, 17),
('HANG10', 'NCC1', 'LOAI9', 'Áo lót', 60000, 8),
('HANG2', 'NCC1', 'LOAI10', 'Áo len', 150000, 6),
('HANG3', 'NCC2', 'LOAI8', 'Quần lót', 50000, 29),
('HANG4', 'NCC2', 'LOAI7', 'Quần đùi', 100000, 10),
('HANG5', 'NCC6', 'LOAI3', 'Áo thun', 150000, 6),
('HANG6', 'NCC3', 'LOAI1', 'Quần Jean', 350000, 13),
('HANG7', 'NCC9', 'LOAI4', 'Quần kaki', 250000, 35),
('HANG8', 'NCC5', 'LOAI5', 'Áo so mi', 450000, 64),
('HANG9', 'NCC1', 'LOAI6', 'Áo khoác', 600000, 17);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ncc`
--

CREATE TABLE `ncc` (
  `MaNcc` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenNcc` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Sdt` varchar(11) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiaChiNcc` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `ncc`
--

INSERT INTO `ncc` (`MaNcc`, `TenNcc`, `Sdt`, `DiaChiNcc`) VALUES
('NCC1', 'NCC Trẻ', '02839316289', '161B Lý Chính Thắng, Phường 7, Quận 3 , TP. Hồ Chí Minh'),
('NCC10', 'Gucci', '0438515380', '175 Giảng Võ, Q. Đống Đa, Hà Nội'),
('NCC2', 'Chanel', '083847985', ' 59 Đỗ Quang, phường Trung Hoà, quận Cầu Giấy, Hà Nội'),
('NCC3', 'Thái Hà', '028225326', '88/28 Đào Duy Anh, phường 9, Quận Phú Nhuận, TP.HCM'),
('NCC4', 'Mạnh Hùng', '0243822908', '55 Quang Trung, Nguyễn Du, Hai Bà Trưng, Hà Nội'),
('NCC5', 'Calvin Klein', '098606663', 'Ô số e34 - Khu đấu giá 3ha - Phúc Diễn - Bắc Từ Liêm - Hà Nội'),
('NCC6', 'Victoria Secret', '024730933', 'Nhà NV22 khu dự án Handico - Ngõ 13 Lĩnh Nam - P. Mai Động - Q. Hoàng Mai - TP. Hà Nội'),
('NCC7', 'Minh Long', '02473008377', 'LK 02 - 03, Dãy B, KĐT Green Pearl, 378 Minh Khai, Hai Bà Trưng, Hà Nội.'),
('NCC8', 'Louis Vuitton', '1900 2647', 'Tầng 3, Dream Home Center, 11a ngõ 282 Nguyễn Huy Tưởng, Thanh Xuân, Hà Nội'),
('NCC9', 'Hades', '0394081802', '40 - 42 Nguyễn Thị Minh Khai, phường ĐaKao, Quận 1, Tp. Hồ Chí Minh');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNv` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `HoNv` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenNv` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiaChiNv` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ChucVu` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Luong` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNv`, `HoNv`, `TenNv`, `DiaChiNv`, `ChucVu`, `Luong`) VALUES
('NV001', 'Đặng', 'Duy Tân', '123 An Dương Vương P7 Q5 TPHCM', 'Quản lý', 100000),
('NV002', 'Trần', 'Lương Thiệu Huy', '331 Lê Hồng Phong P2 Q10 TPHCM', 'Nhân viên', 150000),
('NV003', 'Chu', 'Võ Đại', '45/25 Phạm Hùng P9 Q8 TPHCM', 'Quản lý', 300000),
('NV004', 'Nguyễn ', 'Thanh Ngân', '273 An Dương Vương P3 Q5 TPHCM', 'Nhân Viên', 15000),
('NV005', 'Đỗ', 'Minh Khoa', '273 An Dương Vương P3 Q5 TPHCM', 'Nhân Viên', 50000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPn` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaNv` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaNcc` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayNhap` date NOT NULL,
  `ThanhTienPn` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`MaPn`, `MaNv`, `MaNcc`, `NgayNhap`, `ThanhTienPn`) VALUES
('PN001', 'NV001', 'NCC1', '2022-04-14', 5600000),
('PN002', 'NV001', 'NCC3', '2022-04-13', 3510000),
('PN003', 'NV002', 'NCC5', '2022-04-17', 440000),
('PN004', 'NV001', 'NCC3', '2022-04-18', 2700000),
('PN005', 'NV004', 'NCC9', '2022-04-18', 350000),
('PN006', 'NV003', 'NCC1', '2022-05-09', 1050000),
('PN007', 'NV004', 'NCC10', '2022-06-01', 600000),
('PN008', 'NV005', 'NCC8', '2022-08-20', 800000),
('PN009', 'NV003', 'NCC9', '2022-09-16', 1260000),
('PN010', 'NV002', 'NCC5', '2022-03-17', 4200000),
('PN011', 'NV001', 'NCC5', '2022-06-18', 120000);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `cthd`
--
ALTER TABLE `cthd`
  ADD PRIMARY KEY (`MaHd`,`MaHang`),
  ADD KEY `MaHd` (`MaHd`),
  ADD KEY `MaHang` (`MaHang`) USING BTREE;

--
-- Chỉ mục cho bảng `ctkm`
--
ALTER TABLE `ctkm`
  ADD PRIMARY KEY (`MaKm`,`MaHang`),
  ADD KEY `MaKm` (`MaKm`),
  ADD KEY `MaHang` (`MaHang`) USING BTREE;

--
-- Chỉ mục cho bảng `ctpn`
--
ALTER TABLE `ctpn`
  ADD PRIMARY KEY (`MaPn`,`MaHang`),
  ADD KEY `MaPn` (`MaPn`),
  ADD KEY `MaHang` (`MaHang`) USING BTREE;

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHd`),
  ADD KEY `hd1` (`MaNv`),
  ADD KEY `hd2` (`MaKh`),
  ADD KEY `hd3` (`MaKm`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKh`);

--
-- Chỉ mục cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD PRIMARY KEY (`MaKm`);

--
-- Chỉ mục cho bảng `loaihang`
--
ALTER TABLE `loaihang`
  ADD PRIMARY KEY (`MaLoai`);

--
-- Chỉ mục cho bảng `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`MaNv`);

--
-- Chỉ mục cho bảng `mathang`
--
ALTER TABLE `mathang`
  ADD PRIMARY KEY (`MaHang`),
  ADD KEY `s1` (`MaNcc`),
  ADD KEY `s2` (`MaLoai`);

--
-- Chỉ mục cho bảng `ncc`
--
ALTER TABLE `ncc`
  ADD PRIMARY KEY (`MaNcc`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNv`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPn`),
  ADD KEY `pn1` (`MaNv`),
  ADD KEY `pn2` (`MaNcc`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `cthd`
--
ALTER TABLE `cthd`
  ADD CONSTRAINT `cthd1` FOREIGN KEY (`MaHd`) REFERENCES `hoadon` (`MaHd`),
  ADD CONSTRAINT `cthd2` FOREIGN KEY (`MaHang`) REFERENCES `mathang` (`MaHang`);

--
-- Các ràng buộc cho bảng `ctkm`
--
ALTER TABLE `ctkm`
  ADD CONSTRAINT `ctkm1` FOREIGN KEY (`MaKm`) REFERENCES `khuyenmai` (`MaKm`),
  ADD CONSTRAINT `ctkm2` FOREIGN KEY (`MaHang`) REFERENCES `mathang` (`MaHang`);

--
-- Các ràng buộc cho bảng `ctpn`
--
ALTER TABLE `ctpn`
  ADD CONSTRAINT `ctpn1` FOREIGN KEY (`MaPn`) REFERENCES `phieunhap` (`MaPn`),
  ADD CONSTRAINT `ctpn2` FOREIGN KEY (`MaHang`) REFERENCES `mathang` (`MaHang`);

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hd1` FOREIGN KEY (`MaNv`) REFERENCES `nhanvien` (`MaNv`),
  ADD CONSTRAINT `hd2` FOREIGN KEY (`MaKh`) REFERENCES `khachhang` (`MaKh`),
  ADD CONSTRAINT `hd3` FOREIGN KEY (`MaKm`) REFERENCES `khuyenmai` (`MaKm`);

--
-- Các ràng buộc cho bảng `login`
--
ALTER TABLE `login`
  ADD CONSTRAINT `fk_login` FOREIGN KEY (`MaNv`) REFERENCES `nhanvien` (`MaNv`);

--
-- Các ràng buộc cho bảng `mathang`
--
ALTER TABLE `mathang`
  ADD CONSTRAINT `s1` FOREIGN KEY (`MaNcc`) REFERENCES `ncc` (`MaNcc`),
  ADD CONSTRAINT `s2` FOREIGN KEY (`MaLoai`) REFERENCES `loaihang` (`MaLoai`);

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `pn1` FOREIGN KEY (`MaNv`) REFERENCES `nhanvien` (`MaNv`),
  ADD CONSTRAINT `pn2` FOREIGN KEY (`MaNcc`) REFERENCES `ncc` (`MaNcc`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
