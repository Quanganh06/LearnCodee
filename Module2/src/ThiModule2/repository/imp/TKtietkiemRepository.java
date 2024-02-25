package ThiModule2.repository.imp;

import ThiModule2.model.TkBank;
//import ThiModule2.model.TkThanhtoan;
import ThiModule2.model.TkTietkiem;
import ThiModule2.repository.ITktietkiem;
import ThiModule2.utill.ReadandWrite;

import java.util.ArrayList;
import java.util.List;

public class TKtietkiemRepository implements ITktietkiem {
    private  final String Link_tk ="/Users/macbook/Desktop/Module-II/src/ThiModule2/model";

    @Override
    public void themmoi(TkBank tkBank) {
        List<String> stringList = new ArrayList<>();
        stringList.add(tkBank.toString());
        ReadandWrite.writeToCSV(Link_tk, stringList,true);
    }

    @Override
    public void xoa(String MaTK) {

    }

    @Override
    public List hienthidanhsach() {
        List<TkTietkiem> tkTietkiems = new ArrayList<>();
        List<String> stringList = ReadandWrite.readCSVFile(Link_tk);
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            TkTietkiem tkTietkiem = new TkTietkiem(array[0],array[1],array[2],array[3],(array[4]),array[5]);
            tkTietkiems.add(tkTietkiem);
        }

        return tkTietkiems;
    }

//    @Override
//    public static void themmoi(TkTietkiem tkTietkiem) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add(tkTietkiem.toString());
//        ReadAndWriters.writeToCSV(Link_tk, stringList,true);
//    }
//
}
