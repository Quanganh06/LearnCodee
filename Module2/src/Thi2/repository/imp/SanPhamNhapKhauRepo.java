//package Thi2.repository.imp;
//
//import Thi2.model.SanPhamNhapKhau;
//import Thi2.repository.ISanPhamNhapKhau;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class SanPhamNhapKhauRepo implements ISanPhamNhapKhau {
//    private final String FILE_PATH = "/Users/macbook/Desktop/learncode/LearnCodee/Module2/src/Thi2/data/sanphamnhapkhau.csv";
//    private List<SanPhamNhapKhau> sanPhamNhapKhauList = new ArrayList<>();
//    private Scanner scanner = new Scanner(System.in);
//    private Scanner readFile = new Scanner(System.in);
//
//    @Override
//    public void add(SanPhamNhapKhau sanPhamNhapKhau) {
//        int lastID = 0;
//        if (sanPhamNhapKhauList.size() > 0) {
//            lastID = sanPhamNhapKhauList.get(sanPhamNhapKhauList.size() - 1).getMasanpham();
//        }
//        sanPhamNhapKhau.setMasanpham(lastID + 1);
//        sanPhamNhapKhauList.add(sanPhamNhapKhau);
//        writeFile(Collections.singletonList(sanPhamNhapKhau), FILE_PATH, true);
//    }
//
//    public void writeFile(List<SanPhamNhapKhau> sanPhamNhapKhaus, String filePath, boolean append) {
//        File file = new File(filePath);
//
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
//            for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhauList) {
//                String line = sanPhamNhapKhau.getIdsanpham() + "," + sanPhamNhapKhau.getMasanpham() + "," + sanPhamNhapKhau.getTensanpham() + "," + sanPhamNhapKhau.getGiaban() + "," + sanPhamNhapKhau.getSoluong() + "," + sanPhamNhapKhau.getNhasanxuat() + "," + sanPhamNhapKhau.getGianhapkhau() + "," + sanPhamNhapKhau.getTinhnhap() + "," + sanPhamNhapKhau.getThuenhapkhau();
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException("Error writing to file: " + e.getMessage());
//        }
//    }
//
//    public SanPhamNhapKhauRepo() {
//        sanPhamNhapKhauList = display();
//    }
//
//    @Override
//    public void delete(int id) {
//        sanPhamNhapKhauList = display();
//        SanPhamNhapKhau sanPhamNhapKhauRemove = null;
//
//        for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhauList) {
//            if (sanPhamNhapKhauRemove.getMasanpham() == id) {
//                sanPhamNhapKhauRemove = sanPhamNhapKhau;
//                break;
//            }
//        }
//
//        if (sanPhamNhapKhauRemove != null) {
//            sanPhamNhapKhauList.remove(sanPhamNhapKhauRemove);
//            writeFile(sanPhamNhapKhauList, FILE_PATH, false);
//        }
//    }
//
//
//
//    @Override
//    public List display() {
//        List<SanPhamNhapKhau> lists = new ArrayList<>();
//        List<String> strings = readFile.ReadFile(FILE_PATH);
//        for (String str : strings) {
//            String[] temp = str.split(",");
//            String idsanpham = temp[0];
//            String masanpham = temp[1];
//            String tensanpham = temp[2];
//            String giaban = temp[3];
//            String soluong = temp[4];
//            String nhasanxuat = temp[5];
//            String gianhapkhau = temp[6];
//            String tinhnhap = temp[7];
//            String thuenhap = temp[8];
//            SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(idsanpham, masanpham, tensanpham, giaban, soluong, nhasanxuat, gianhapkhau, tinhnhap, thuenhap);
//            lists.add(sanPhamNhapKhau);
//
//
//        }
//        return lists;
//    }
//
//    @Override
//    public List findAll() {
//        return sanPhamNhapKhauList;
//    }
//
//    @Override
//    public void timKiemID(int id) {
//        for (SanPhamNhapKhau product : sanPhamNhapKhauList) {
//            if (product.getMasanpham() == id) {
//                System.out.println(product);
//            }
//        }
//    }
//
//    @Override
//    public void tinKiemTen(String name) {
//        for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhauList) {
//            if (sanPhamNhapKhau.getTensanpham().equals(name)) {
//                System.out.println(sanPhamNhapKhau);
//            }
//        }

//    }
//}
