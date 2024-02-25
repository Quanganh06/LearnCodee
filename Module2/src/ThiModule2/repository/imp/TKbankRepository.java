package ThiModule2.repository.imp;

import ThiModule2.model.TkBank;
import ThiModule2.model.TkThanhtoan;
import ThiModule2.repository.ITKbankRepository;
import ThiModule2.utill.ReadandWrite;

import java.util.ArrayList;
import java.util.List;

public class TKbankRepository implements ITKbankRepository {
    private final String Link_file="/Users/macbook/Desktop/Module-II/src/ThiModule2/model";

    @Override
    public void themmoi(TkBank tkBank) {
        List<String>stringList=new ArrayList<>();
        stringList.add(tkBank.toString());
        ReadandWrite.writeToCSV(Link_file,stringList,true);

    }

    @Override
    public void xoa(String MaTK) {
        List<TkBank>tkBankList=hienthidanhsach();
        for (int i=0;i<tkBankList.size();i++){
            if (tkBankList.get(i).getMaTK().equals(MaTK)){
                tkBankList.remove(i);
            }
            break;
        }
        List<String>stringList=new ArrayList<>();
        for (TkBank tkBank:tkBankList){
            stringList.add(tkBank.toString());
        }
        ReadandWrite.writeToCSV(Link_file,stringList,false);

    }

    @Override
    public List<TkBank> hienthidanhsach() {
        List<TkBank>bankList=new ArrayList<>();
        List<String>stringList=ReadandWrite.readCSVFile(Link_file);
        String[] array=null;
        for (String string:stringList){
            array=string.split(",");
            TkThanhtoan tkThanhtoan =new TkThanhtoan(array[0],array[1],array[2],array[3],(array[4]),array[5]);


        }
        return null;
    }
}
