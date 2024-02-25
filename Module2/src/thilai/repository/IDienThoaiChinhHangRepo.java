package thilai.repository;

import thilai.model.ChinhHang;

import java.util.List;

public interface IDienThoaiChinhHangRepo {
    void them(ChinhHang chinhHang);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);


}
