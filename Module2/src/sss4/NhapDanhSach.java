package sss4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NhapDanhSach {
    ArrayList<NhanVien> listNV = new ArrayList<>();

    Scanner s = new Scanner(System.in);

    public void NhapThongTin(){
        int chon;
        do {
            System.out.println("Moi Ban Chon: "
                    + "\t\n1.Nhan Vien Hanh Chinh: "
                    + "\t\n2.Nhan Vien Tiep Thi: "
                    + "\t\n3.Truong Phong: "
                    + "\t\n0.Ket thuc chon: ");
            System.out.println(" \t\t\t-----------------------------");
            System.out.println("Nhap lua chon cua ban:   ");
             chon = s.nextInt();
            s.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("-- Nhan Vien Hanh Chinh --");
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    System.out.print("Nhap ma nhan vien: ");
                    String maNV = s.nextLine();
                    System.out.print("Nhap ten nhan vien: ");
                    String tenNV = s.nextLine();
                    System.out.print("Nhap luong: ");
                    double luong = s.nextDouble();
                    nvhc.setId(maNV);
                    nvhc.setName(tenNV);
                    nvhc.setLuong(luong);
                    listNV.add(nvhc);
                    double thuNhapNhanVienHanhChinh = nvhc.getLuong();
                    double thueNhanVienHanhChinh = nvhc.getThue();
                    nvhc.getThue();
                    listNV.add(nvhc);
                    break;
                case 2:
                    System.out.println("-- Nhan Vien Tiep Thi --");
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    System.out.print("Nhap ma nhan vien: ");
                    String id = s.nextLine();
                    System.out.print("Nhap ten nhan vien: ");
                    String nameNvtt = s.nextLine();
                    System.out.print("Nhap luong: ");
                    double luongtt = s.nextDouble();
                    nvtt.setId(id);
                    nvtt.setName(nameNvtt);
                    nvtt.setLuong(luongtt);
                    listNV.add(nvtt);
                    break;
                case 3:
                    System.out.println("-- Truong Phong --");
                    TruongPhong tp = new TruongPhong();
                    System.out.print("Nhap ma nhan vien: ");
                    String id1 = s.nextLine();
                    System.out.print("Nhap ten nhan vien: ");
                    String nameNvtt1 = s.nextLine();
                    System.out.print("Nhap luong: ");
                    double luongtt1 = s.nextDouble();
                    tp.setId(id1);
                    tp.setName(nameNvtt1);
                    tp.setLuong(luongtt1);
                    listNV.add(tp);
                    break;
                case 0:
                    System.out.println("Ban da ket thuc nhap danh sach nhan vien.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }



        } while (chon!=0);
    }

    public void xuatThongTin() {
        if(listNV.isEmpty()){
            System.out.println("Danh Sach nhan vien rong !");
            return;
        }
        System.out.println("-------------Danh sach nhan vien------------");
        for (NhanVien nhanVien:listNV){
            System.out.println(nhanVien);
        }
    }

    public void timNhanVien(){
        System.out.println("\n\nNhap ma nhan vien can tim: ");
        String ma = s.nextLine();
        boolean timNV = false;
        for (NhanVien nv : listNV) {
            if (nv.getId().equalsIgnoreCase(ma)) {
                nv.xuatThongTin();
                timNV = true;
                break;
            }
        }
        if(!timNV) {
            System.out.printf("\n\nTrong Danh Sach khong co ma nhan vien %s ban muon tim !", ma);
        }
    }

    public void xoaNhanVien() {
        System.out.println("\n\nNhap ma nhan vien can xoa: ");
        String ma = s.nextLine();
        boolean timNV = false;
        for (NhanVien nv : listNV) {
            if (nv.getId().equalsIgnoreCase(ma)) {
                listNV.remove(nv);
                System.out.printf("\n\nDa xoa nhan vien co ma %s thanh cong !", ma);
                timNV = true;
                break;
            }
        }
        if(!timNV) {
            System.out.printf("\n\nTrong Danh Sach khong co ma nhan vien %s ban muon xoa !", ma);
        }
    }

    public void updateMaNV() {
        System.out.println("\n\nNhap ma nhan vien can cap nhat: ");
        String ma = s.nextLine();
        boolean timNV = false;
        for (NhanVien nv : listNV) {
            if (nv.getId().equalsIgnoreCase(ma)) {
                nv.NhapThongTin();
                timNV = true;
                break;
            }
        }
        if(!timNV) {
            System.out.printf("\n\nTrong Danh Sach khong co ma nhan vien %s ban muon cap nhat !", ma);
        }
    }

    public void timNVtheoluong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tim NV trong khoang luong");
        System.out.print("Nhap khoang luong thap nhat : ");
        double min = sc.nextDouble();
        System.out.print("Nhap khoang luong cao nhat : ");
        double max = sc.nextDouble();
        boolean ketQua = false;
        for (NhanVien nv : listNV) {
            if (min <= nv.getLuong() && nv.getLuong() <= max) {
                System.out.printf("\nNhan Vien co khoang luong tu %.3f - %.3f la :  \n", min, max);
                nv.xuatThongTin();
                ketQua = true;
            }
        }
        if (!ketQua) {
            System.out.println("Khong co nhan vien trong khoang luong ma ban muon tim !");
        }
    }

    public void sapXepTheoHoTenNV() {
        System.out.println("Sap xep danh sach nhan vien theo ten");
        Collections.sort(listNV, (nv1, nv2) -> nv1.getName().compareTo(nv2.getName()));
        System.out.println("Danh Sach Ho Ten sau khi sap xep");
        xuatThongTin(); // In ra danh sách sau khi đã sắp xếp
    }

    public void sapXepTheoThuNhap() {
        System.out.println("Sap xep danh sach nhan vien theo Thu Nhap");
        Collections.sort(listNV, (nv1, nv2) -> Double.compare(nv2.getThuNhap(), nv1.getThuNhap()));
        System.out.println("Danh Sach theo thu nhap sau khi sap xep");
        xuatThongTin(); // In ra danh sách sau khi đã sắp xếp
    }

    public void top5ThuNhap() {
        System.out.println("TOP 5 Nhan Vien Co Thu Nhap Cao Nhat");
                System.out.println("TOP 5 Nhan Vien Co Thu Nhap Cao Nhat");
                        System.out.println("TOP 5 Nhan Vien Co Thu Nhap Cao Nhat");
                Collections.sort(listNV, (nv1, nv2) -> Double.compare(nv2.getThuNhap(), nv1.getThuNhap()));
                int count = 0;
                for (NhanVien nv : listNV) {
                    if (count < 5) {
                        nv.xuatThongTin();
                        count++;
                    } else {
                        break;
                    }
                }
            }
}
