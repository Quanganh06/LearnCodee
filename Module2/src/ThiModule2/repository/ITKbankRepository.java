package ThiModule2.repository;

import ThiModule2.model.TkBank;

import java.util.List;

public interface ITKbankRepository {
  void themmoi(TkBank tkBank);
    void xoa(String MaTK);
    List hienthidanhsach();
}
