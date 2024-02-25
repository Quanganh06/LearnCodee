package thi.Repository.SanPhamNhapKhauRepository;


import thi.Model.SanPhamNhapKhau;
import thi.ReadFile.ReadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SanPhamNhapKhauRepo implements ISanPhamNhapKhauRepo {
    private final String FILE_PATH= "/Users/macbook/Desktop/learncode/LearnCodee/Module2/src/thi/Data/danhsachnhapkhau.csv";
    private List<SanPhamNhapKhau> sanPhamNhapKhauList = new ArrayList<>();
    private Scanner scanner= new Scanner(System.in);
    private ReadFile readFile = new ReadFile();
    @Override
    public void them(SanPhamNhapKhau sanPhamNhapKhau) {
        int lastID = 0;
        if (sanPhamNhapKhauList.size()>0){
            lastID = sanPhamNhapKhauList.get(sanPhamNhapKhauList.size()-1).getMaSanPham();
        }
        sanPhamNhapKhau.setMaSanPham(lastID+1);
        sanPhamNhapKhauList.add(sanPhamNhapKhau);
        writeFile(Collections.singletonList(sanPhamNhapKhau),FILE_PATH,true);
    }
    public void writeFile(List<SanPhamNhapKhau> sanPhamNhapKhaus, String filePath, boolean append) {
        File file = new File(filePath);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhaus) {
                String line = sanPhamNhapKhau.getMaSanPham() + "," + sanPhamNhapKhau.getTenSanPham() + "," + sanPhamNhapKhau.getGiaBan() + "," + sanPhamNhapKhau.getSoLuong()+ "," + sanPhamNhapKhau.getNhaSanXuat()+ "," + sanPhamNhapKhau.getGiaNhapKhau()+ "," + sanPhamNhapKhau.getTinhThanhNhap()+ "," + sanPhamNhapKhau.getThueNhapKhau();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + e.getMessage());
        }
    }

    public SanPhamNhapKhauRepo(){
        sanPhamNhapKhauList = danhSach();
    }
    @Override
    public List danhSach() {
        List<SanPhamNhapKhau> lists = new ArrayList<>();
        List<String> strings = readFile.ReadFile(FILE_PATH);
        for (String str : strings) {
            String[] temp = str.split(",");
            int maSanPham = Integer.parseInt(temp[0]);
            String tenSanPham = temp[1];
            Double giaBan = Double.parseDouble(temp[2]);
            int soLuong = Integer.parseInt(temp[3]);
            String nhaSanXuat = temp[4];
            int giaNhapKhau = Integer.parseInt(temp[5]);
            String tinhThanhNhap = temp[6];
            int thueNhapKhau = Integer.parseInt(temp[7]);
            SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaNhapKhau,tinhThanhNhap,thueNhapKhau);
            lists.add(sanPhamNhapKhau);

        }
        return lists;
    }

    @Override
    public List findAll() {
        return sanPhamNhapKhauList;
    }

    @Override
    public void xoa(int id) {
        sanPhamNhapKhauList = danhSach();
        SanPhamNhapKhau sanPhamNhapKhauToRemove= null;

        for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhauList) {
            if (sanPhamNhapKhau.getMaSanPham() == id) {
                sanPhamNhapKhauToRemove = sanPhamNhapKhau;
                break;
            }
        }

        if (sanPhamNhapKhauToRemove != null) {
            sanPhamNhapKhauList.remove(sanPhamNhapKhauToRemove);
            writeFile(sanPhamNhapKhauList, FILE_PATH, false);
        }
    }

    @Override
    public void timKiemID(int id) {
        for (SanPhamNhapKhau sanPhamNhapKhau: sanPhamNhapKhauList){
            if (sanPhamNhapKhau.getMaSanPham()==id){
                System.out.println(sanPhamNhapKhau);
            }
        }
    }

    @Override
    public void tinKiemTen(String name) {
        for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhauList){
            if (sanPhamNhapKhau.getTenSanPham().equals(name)){
                System.out.println(sanPhamNhapKhau);
            }
        }
    }
}
