package thilai.repository.imp;


import thilai.model.ChinhHang;
import thilai.repository.IDienThoaiChinhHangRepo;

import thi.ReadFile.ReadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class DienThoaiChinhHangRepo implements IDienThoaiChinhHangRepo {
    private final String FILE_PATH= "/Users/macbook/Desktop/learncode/LearnCodee/Module2/src/thilai/data/dt.csv";
    private List<ChinhHang>chinhHangList  = new ArrayList<>();
    private Scanner scanner= new Scanner(System.in);
    private ReadFile readFile = new ReadFile();
    @Override
    public void them(ChinhHang chinhHang) {
        int lastID = 0;
        if (chinhHangList.size()>0){
            lastID = chinhHangList.get(chinhHangList.size()-1).getId();
        }
        chinhHang.setId(lastID+1);
        chinhHangList.add(chinhHang);
        writeFile(Collections.singletonList(chinhHang),FILE_PATH,true);
    }
    public void writeFile(List<ChinhHang> chinhHangs, String filePath, boolean append) {
        File file = new File(filePath);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for (ChinhHang chinhHang:chinhHangs) {
                String line = chinhHang.getId()+ "," +chinhHang.getId()+","+chinhHang.getTendienthoai()+","+chinhHang.getGiaban()+","+chinhHang.getSoluong()+","+chinhHang.getNhasanxuat()+","+chinhHang.getThoigianbaohanh()+","+chinhHang.getPhamvibaohanh();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + e.getMessage());
        }
    }

    public DienThoaiChinhHangRepo(){
        chinhHangList = danhSach();
    }

    @Override
    public List danhSach() {
        List<ChinhHang> lists = new ArrayList<>();
        List<String> strings = readFile.ReadFile(FILE_PATH);
        for (String str : strings) {
            String[] temp = str.split(",");
            int id = Integer.parseInt(temp[0]);
            String tenDienThoai = temp[1];
            String giaBan = temp[2];
            String soLuong = temp[3];
            String nhaSanXuat = temp[4];
            int thoigianbaohanh = Integer.parseInt(temp[5]);
            String phamViBaoHanh = temp[6];
            ChinhHang chinhHang = new ChinhHang(id,tenDienThoai,giaBan,soLuong,nhaSanXuat,thoigianbaohanh,phamViBaoHanh);
            lists.add(chinhHang);
        }
            return lists;
    }

    @Override
    public List findAll() {
        return chinhHangList;
    }

    @Override
    public void xoa(int id) {
        chinhHangList = danhSach();
        ChinhHang chinhHangRemove= null;

        for (ChinhHang chinhHang:chinhHangList) {
            if (chinhHang.getId() == id) {
                chinhHangRemove=chinhHang;
                break;
            }
        }

        if (chinhHangRemove != null) {
            chinhHangList.remove(chinhHangRemove);
            writeFile(chinhHangList, FILE_PATH, false);
        }
    }

    @Override
    public void timKiemID(int id) {
        for (ChinhHang chinhHang:chinhHangList){
            if (chinhHang.getId()==id){
                System.out.println(chinhHang);
            }
        }

    }

    @Override
    public void tinKiemTen(String name) {
        for (ChinhHang chinhHang:chinhHangList){
            if (chinhHang.getTendienthoai().equals(name)){
                System.out.println(chinhHang);
            }
        }

    }
}
