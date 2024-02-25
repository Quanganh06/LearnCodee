//package Thi2.service;
//
//import Thi2.model.SanPhamNhapKhau;
//import Thi2.model.SanPhamXuatKhau;
//import Thi2.repository.ISanPhamNhapKhau;
//import Thi2.repository.ISanPhamXuatKhau;
//import Thi2.repository.imp.SanPhamXuatKhaurepos;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class SanPhamXuatKhauService implements ISanPhamXuatKhauService {
//    private static SanPhamXuatKhau iSanPhamXuatKhau= new SanPhamXuatKhau();
//    private Scanner scanner = new Scanner(System.in);
//    @Override
//    public void add() {
//        SanPhamXuatKhau sanPhamXuatKhau = this.getThongTin();
//        iSanPhamXuatKhau=sanPhamXuatKhau;
//        System.out.println("Thêm mới thành công");
//        display();
//    }
//
//    private SanPhamXuatKhau getThongTin() {
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
//        System.out.println("gia xuat khau: ");
//        String giaxuatkhau=scanner.nextLine();
//        System.out.println("Nhap quoc gia nhap: ");
//        String quocgianhapp=scanner.nextLine();
//        SanPhamXuatKhau sanPhamXuatKhau =new SanPhamXuatKhau(id,tensanpham,giaban,soluong,nhasanxuat,giaxuatkhau,quocgianhapp);
//        return  sanPhamXuatKhau;
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
//        public void delete ( int id){
//            ISanPhamXuatKhau.delete(id);
//            display();
//        }
//    }
//}
