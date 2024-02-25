package Onthimodule22222222.repository.BenhAnThuong;

import Onthimodule22222222.model.BenhAnThuong;
import java.util.List;

public interface IBenhAnThuongRepository {
    public void them(BenhAnThuong benhAnThuong);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);
}
