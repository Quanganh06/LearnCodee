package Onthimodule22222222.repository.BenhAnVip;

import Onthimodule22222222.model.BenhAnVip;
import java.util.List;

public interface IBenhAnVipRepo {
    public void them(BenhAnVip benhAnVip);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);
}
