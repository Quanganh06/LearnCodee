package thilai.serivice;



import thilai.model.ChinhHang;
import thilai.repository.IDienThoaiChinhHangRepo;
import thilai.repository.imp.DienThoaiChinhHangRepo;

import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangService implements IDienThoaiChinhHangService {
    private static IDienThoaiChinhHangRepo iDienThoaiChinhHangRepo=new DienThoaiChinhHangRepo();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void them() {
        ChinhHang chinhHang = this.getThongTin();
        iDienThoaiChinhHangRepo.them(chinhHang);
        System.out.println("Thêm mới thành công");
        danhSach();
    }

    private ChinhHang getThongTin() {


        int maSanPham = 0;

        System.out.println("Tên sản phẩm: ");
        String tenSanPham = scanner.nextLine();

        System.out.println("Giá bán:");
        String giaBan = scanner.nextLine();

        System.out.println("Số lượng: ");
        String soLuong = scanner.nextLine();

        System.out.println("Nhà Sản Xuất");
        String nhaSanXuat = scanner.nextLine();

        System.out.println("Thời gian bảo hành : ");
        double thoigianbaohanh = Double.parseDouble(scanner.nextLine());

        System.out.println("Phạm Vị Bảo Hành: ");
        String phamviBaoHanh = scanner.nextLine();
        ChinhHang chinhHang=new ChinhHang(maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat, thoigianbaohanh,phamviBaoHanh);


        return chinhHang;


    }

    @Override
    public void danhSach() {
        List<ChinhHang> chinhHangList = iDienThoaiChinhHangRepo.findAll();
        for (ChinhHang chinhHang : chinhHangList) {
            System.out.println(chinhHang);
        }

    }

    @Override
    public void xoa(int id) {
        iDienThoaiChinhHangRepo.xoa(id);
        danhSach();

    }

    @Override
    public void timKiemID(int id) {
        iDienThoaiChinhHangRepo.timKiemID(id);

    }

    @Override
    public void tinKiemTen(String name) {
        iDienThoaiChinhHangRepo.tinKiemTen(name);

    }
}