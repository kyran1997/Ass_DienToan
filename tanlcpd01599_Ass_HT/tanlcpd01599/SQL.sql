create database QLBH
use QLBH 

create table TAI_KHOAN(
Username nvarchar(50) not null primary key,
Pass nvarchar(50) not null,
Vai_tro nvarchar(50) not null,
Ho_ten nvarchar(50) not null,
Dia_chi nvarchar(50) not null,
Email nvarchar(50) not null,
Sdt nvarchar (15) not null
)

create table LOAI_SP(
Ma_loai nchar(10) not null primary key,
Loai_sp nvarchar(50) not null,
)

create table SAN_PHAM(
Ma_sp nchar(10) not null primary key,
Ten_sp nvarchar(50) not null,
Mo_ta nvarchar(500) not null,
So_luong int not null,
Don_gia float not null,
Hinh_anh nvarchar(200) not null,
Nha_sx nvarchar(50) not null,
Ma_loai nchar(10) not null,
foreign key (Ma_loai) references LOAI_SP(Ma_loai)
)

create table DON_HANG(
Ma_don_hang nchar(10) not null primary key,
Username nvarchar(50) not null,
Ngay_mua datetime not null,
Trang_thai nchar(10),
foreign key (Username) references TAI_KHOAN(Username)
)

create table DON_HANG_CT(
Ma_don_hang_ct nchar(10) not null primary key,
Ma_don_hang nchar(10) not null,
Ma_sp nchar(10) not null,
So_luong int not null,
Gia_tien float not null,
foreign key (Ma_sp) references SAN_PHAM(Ma_sp),
foreign key (Ma_don_hang) references DON_HANG(Ma_don_hang),
)

-- Truy xuất nhập liệu
select * from TAI_KHOAN 
select * from LOAI_SP
select * from SAN_PHAM
SELECT * FROM SAN_PHAM WHERE Ma_loai = '" + Ma_loai + "'
insert into TAI_KHOAN values(
'tan','123','admin','Tan','111 NTT','tan@yahoo.com','11111111')
insert into TAI_KHOAN values(
'khanh','123','customer','Khanh','222 NTT','khanh@yahoo.com','22222222')



insert into LOAI_SP values(
'k01','Dien thoai')
insert into LOAI_SP values(
'k02','Laptop')




insert into SAN_PHAM values(
'sp001','Laptop Asus','Màn hình lớn. Trải nghiệm giải trí tuyệt vời.',200, 5000000,'Image/mt1.jpg','ASUS','k02')
insert into SAN_PHAM values(
'sp002','Laptop HP','Tinh hoa công nghệ HP mang đến cho bạn trải nghiệm tuyệt đỉnh',200, 6000000,'Image/mt2.jpg','HP','k02')
insert into SAN_PHAM values(
'sp003','Laptop SonyVaio',' Nhẹ hơn, mỏng hơn, nhanh hơn',200, 7000000,'Image/mt3.jpg','Sony','k02')
insert into SAN_PHAM values(
'sp004','Laptop Dell','Hiện đang là xu hướng của thời đại',200, 8000000,'Image/mt4.jpg','Dell','k02')
insert into SAN_PHAM values(
'sp005','Laptop Aces','Cấu hình mạnh, hiệu năng tốt',200, 9000000,'Image/mt5.jpg','Aces','k02')
insert into SAN_PHAM values(
'sp006','Dien thoai HTC 620G','tinh nang chong tham nuoc',200, 6000000,'Image/1.jpg','HTC','k01')
insert into SAN_PHAM values(
'sp007','Dien thoai HTC one M7','tinh nang chong tham nuoc, Chụp ảnh đêm tuyệt đẹp',200, 7000000,'Image/2.jpg','HTC','k01')
insert into SAN_PHAM values(
'sp008','Dien thoai HTC one 8','tinh nang chong tham nuoc, Chụp ảnh sắc nét',200, 14000000,'Image/3.jpg','HTC','k01')
insert into SAN_PHAM values(
'sp009','Dien thoai HTC one','tinh nang chong tham nuoc, Chụp nhanh với độ phân giải 23 MP',200, 10000000,'Image/4.jpg','HTC','k01')
insert into SAN_PHAM values(
'sp010','Dien thoai HTC 625g dual','tinh nang chong tham nuoc, Camera tự động lấy nét kép',200, 11000000,'Image/5.jpg','HTC','k01')
