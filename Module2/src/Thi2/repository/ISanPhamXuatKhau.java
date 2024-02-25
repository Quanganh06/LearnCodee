package Thi2.repository;

import Thi2.model.SanPhamNhapKhau;
import Thi2.model.SanPhamXuatKhau;

import java.util.List;

public interface ISanPhamXuatKhau {
    void add(SanPhamXuatKhau sanPhamXuatKhau);

    void add(SanPhamNhapKhau sanPhamNhapKhau);

    void delete(int id);
    List display();
    List findAll();
//    void timKiemID(int id);
//    void tinKiemTen(String name);
}
