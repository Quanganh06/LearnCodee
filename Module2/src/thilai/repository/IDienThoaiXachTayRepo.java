package thilai.repository;

import thilai.model.XachTay;

import java.util.List;

public interface IDienThoaiXachTayRepo {
    void add(XachTay xachTay);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);
}
