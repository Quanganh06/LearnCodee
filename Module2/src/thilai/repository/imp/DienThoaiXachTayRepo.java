package thilai.repository.imp;

import thilai.model.XachTay;
import thilai.repository.IDienThoaiXachTayRepo;
import thi.ReadFile.ReadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class DienThoaiXachTayRepo implements IDienThoaiXachTayRepo {
    private final String FILE_PATH= "/Users/macbook/Desktop/learncode/LearnCodee/Module2/src/thilai/data/Dienthoaixachtay.csv";
    private List<XachTay>xachTayList  = new ArrayList<>();
    private Scanner scanner= new Scanner(System.in);
    private ReadFile readFile = new ReadFile();
    @Override
    public void add(XachTay xachTay) {
//        int lastID = 0;
//        if (xachTayList.size()>0){
//            lastID = xachTayList.get(xachTayList.size()-1).getId();
//        }
//        xachTay.setId(lastID+1);
//        xachTayList.add(xachTay);
//        writeFile(Collections.singletonList(xachTay),FILE_PATH,true);
//    }
//    public void writeFile(List<XachTay> xachTays, String filePath, boolean append) {
//        File file = new File(filePath);
//
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
//            for (XachTay xachTay:xachTays) {
//                String line = chinhHang.getId()+ "," +chinhHang.getId()+","+chinhHang.getTendienthoai()+","+chinhHang.getGiaban()+","+chinhHang.getSoluong()+","+chinhHang.getNhasanxuat()+","+chinhHang.getThoigianbaohanh()+","+chinhHang.getPhamvibaohanh();
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException("Error writing to file: " + e.getMessage());
//        }
    }

//    public DienThoaiXachTayRepo(){
//        xachTayList = danhSach();
//
//    }

    @Override
    public List danhSach() {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void xoa(int id) {

    }

    @Override
    public void timKiemID(int id) {

    }

    @Override
    public void tinKiemTen(String name) {

    }
}
