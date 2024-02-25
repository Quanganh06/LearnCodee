package thi.Repository.SanPhamNhapKhauRepository;



import thi.Model.SanPhamNhapKhau;

import java.util.List;

public interface ISanPhamNhapKhauRepo {
    public void them(SanPhamNhapKhau sanPhamNhapKhau);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);
}
