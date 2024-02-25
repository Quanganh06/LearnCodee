package Thi2.repository;

import Thi2.model.SanPhamNhapKhau;

import java.util.List;

public interface ISanPhamNhapKhau {
    void add(SanPhamNhapKhau sanPhamNhapKhau);
    void delete(int id);
    List display();
    List findAll();
//    void timKiemID(int id);
//   void tinKiemTen(String name);

}
