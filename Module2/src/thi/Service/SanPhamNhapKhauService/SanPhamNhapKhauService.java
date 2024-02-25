package thi.Service.SanPhamNhapKhauService;



import thi.Model.SanPhamNhapKhau;
import thi.Repository.SanPhamNhapKhauRepository.ISanPhamNhapKhauRepo;
import thi.Repository.SanPhamNhapKhauRepository.SanPhamNhapKhauRepo;

import java.util.List;
import java.util.Scanner;

public class SanPhamNhapKhauService implements ISanPhamNhapKhauService{
    private static ISanPhamNhapKhauRepo iSanPhamNhapKhauRepo = new SanPhamNhapKhauRepo();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void them() {
        SanPhamNhapKhau sanPhamNhapKhau = this.getThongTin();
        iSanPhamNhapKhauRepo.them(sanPhamNhapKhau);
        System.out.println("Thêm mới thành công");
        danhSach();
    }

    private SanPhamNhapKhau getThongTin() {


        int maSanPham = 0;

        System.out.println("Tên sản phẩm: ");
        String tenSanPham = scanner.nextLine();

        System.out.println("Giá bán:");
        Double giaBan = Double.parseDouble(scanner.nextLine());

        System.out.println("Số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhà Sản Xuất");
        String nhaSanXuat = scanner.nextLine();

        System.out.println("Giá nhập khẩu: ");
        double giaNhapKhau = Double.parseDouble(scanner.nextLine());

        System.out.println("Tỉnh thành nhập");
        String tinhThanhNhap = scanner.nextLine();

        System.out.println("Thuế nhập khẩu: ");
        int thueNhapKhau = Integer.parseInt(scanner.nextLine());


        SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaNhapKhau,tinhThanhNhap,thueNhapKhau);
        return  sanPhamNhapKhau;
    }

    @Override
    public void danhSach() {
        List<SanPhamNhapKhau> sanPhamNhapKhauList = iSanPhamNhapKhauRepo.findAll();
        for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhauList) {
            System.out.println(sanPhamNhapKhau);
        }
    }

    @Override
    public void xoa(int id) {
        iSanPhamNhapKhauRepo.xoa(id);
        danhSach();
    }

    @Override
    public void timKiemID(int id) {
        iSanPhamNhapKhauRepo.timKiemID(id);
    }

    @Override
    public void tinKiemTen(String name) {
        iSanPhamNhapKhauRepo.tinKiemTen(name);
    }
}
