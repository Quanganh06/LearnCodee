package ThiModule2.repository.imp;

import ThiModule2.model.TkBank;
import ThiModule2.model.TkThanhtoan;
import ThiModule2.repository.ITkthanhtoan;
import ThiModule2.utill.ReadandWrite;


import java.util.ArrayList;
import java.util.List;

public class TkThanhtoanrepository implements ITkthanhtoan {
    private  final String Link_tk="/Users/macbook/Desktop/learncode/LearnCodee/Module2/src/ThiModule2/data/bank_accounts.csv";


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
    public List <TkThanhtoan>hienthidanhsach() {
        List<TkThanhtoan> tkThanhtoanList= new ArrayList<>();
        List<String> stringList = ReadandWrite.readCSVFile(Link_tk);
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            TkThanhtoan tkThanhtoan= new TkThanhtoan(array[0],array[1],array[2],array[3],(array[4]),array[5]);
            tkThanhtoanList.add(tkThanhtoan);
        }

        return tkThanhtoanList;

    }

//    @Override
//    public void themmoi(TkThanhtoan tkThanhtoan) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add(tkThanhtoan.toString());
//        ReadAndWriters.writeToCSV(Link_tk, stringList,true);
////    }
}
