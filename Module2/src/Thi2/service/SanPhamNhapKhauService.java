//package Thi2.service;
//
//import Thi2.model.SanPhamNhapKhau;
//import Thi2.repository.ISanPhamNhapKhau;
//import Thi2.repository.imp.SanPhamNhapKhauRepo;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class SanPhamNhapKhauService implements ISanPhamNhapKhauService{
//    private static SanPhamNhapKhau iSanPhamNhapKhau= new SanPhamNhapKhau();
//    private Scanner scanner = new Scanner(System.in);
//    @Override
//    public void add() {
//        SanPhamNhapKhau sanPhamNhapKhau = this.getThongTin();
//        iSanPhamNhapKhau=sanPhamNhapKhau;
//        System.out.println("Thêm mới thành công");
//        display();
//    }
//
//    private SanPhamNhapKhau getThongTin() {
//        System.out.println("Nhập vào thông tin san pham: ");
//        System.out.println("nhập id: ");
//        int sothutu = Integer.parseInt(scanner.nextLine());
//
//        int id = 0;
//
//        System.out.println("Ten san pham: ");
//        String tensanpham = scanner.nextLine();
//
//        System.out.println("Nhâp gía bán:");
//        String giaban = scanner.nextLine();
//
//        System.out.println("Nhap so luong: ");
//        String soluong = scanner.nextLine();
//
//        System.out.println("Nhap nhà sản xuất: ");
//        String nhasanxuat = scanner.nextLine();
//
//        System.out.println("gia nhap khau: ");
//        String gianhapkhau=scanner.nextLine();
//        System.out.println("Nhap tinh nhap: ");
//        String tinhnhap=scanner.nextLine();
//        System.out.println("Nhap thue: ");
//        String thue=scanner.nextLine();
//SanPhamNhapKhau sanPhamNhapKhau=new SanPhamNhapKhau(id,tensanpham,giaban,soluong,nhasanxuat,gianhapkhau,tinhnhap,thue);
//        return  sanPhamNhapKhau;
//    }
//
//    @Override
//    public void display() {
//        List<SanPhamNhapKhau> sanPhamNhapKhauList = ISanPhamNhapKhau.findAll();
//        for (SanPhamNhapKhau sanPhamNhapKhau:sanPhamNhapKhauList) {
//            System.out.println(sanPhamNhapKhau);
//        }
//    }
//
//    @Override
//    public void delete(int id) {
//        ISanPhamNhapKhau.delete(id);
//        display();
//    }
//}
