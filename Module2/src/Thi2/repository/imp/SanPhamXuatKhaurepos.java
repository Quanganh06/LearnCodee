//package Thi2.repository.imp;
//
//import Thi2.model.SanPhamXuatKhau;
//import Thi2.repository.ISanPhamXuatKhau;
//import Thi2.unt.ReadFile;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//public class SanPhamXuatKhaurepos implements ISanPhamXuatKhau {
//    private final String FILE_PARH="/Users/macbook/Desktop/learncode/LearnCodee/Module2/src/Thi2/data/sanphamxuatkhau.csv";
//    private List<SanPhamXuatKhau> sanPhamXuatKhauList = new ArrayList<>();
//    private Scanner scanner= new Scanner(System.in);
//    private ReadFile readFile = new ReadFile();
//
//    @Override
//    public void add(SanPhamXuatKhau sanPhamXuatKhau) {
//        String lastID = 0;
//        if (sanPhamXuatKhauList.size()>0){
//            lastID = sanPhamXuatKhauList.get(sanPhamXuatKhauList.size()-1).getMasanpham());
//        }
//       sanPhamXuatKhau.setMasanpham(lastID+1);
//        sanPhamXuatKhauList.add(sanPhamXuatKhau);
//        writeFile(Collections.singletonList(sanPhamXuatKhau),FILE_PATH,true);
//    }
//    public void writeFile(List<SanPhamXuatKhau> sanPhamXuatKhauList, String filePath, boolean append) {
//        File file = new File(filePath);
//
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
//            for (SanPhamXuatKhau sanPhamXuatKhau:sanPhamXuatKhauList) {
//                String line =  sanPhamXuatKhau.getIdsanpham() + "," + sanPhamXuatKhau.getMasanpham() + "," + sanPhamXuatKhau.getTensanpham() + "," + sanPhamXuatKhau.getGiaban() + "," + sanPhamXuatKhau.getSoluong() + "," + sanPhamXuatKhau.getNhasanxuat() + "," + sanPhamXuatKhau.getGiaxuatkhau()+","+sanPhamXuatKhau.getQuocgianhap();
//
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException("Error writing to file: " + e.getMessage());
//        }
//    }
//
//    public SanPhamXuatKhaurepos(){
//        sanPhamXuatKhauList=display();
//    }
//    @Override
//    public void delete(int id) {
//        sanPhamXuatKhauList = display();
//        SanPhamXuatKhau sanPhamNhapKhauRemove= null;
//
//        for (SanPhamXuatKhau sanPhamXuatKhauRemove : sanPhamXuatKhauList) {
//            if (sanPhamXuatKhauRemove.getMasanpham() == id) {
//                sanPhamNhapKhauRemove=sanPhamXuatKhauRemove;
//                break;
//            }
//        }
//
//        if (sanPhamNhapKhauRemove != null) {
//            sanPhamXuatKhauList.remove(sanPhamNhapKhauRemove);
//            writeFile(sanPhamXuatKhauList, FILE_PATH, false);
//        }
//    }
//
//
//
//    @Override
//    public List display() {
//        List<SanPhamXuatKhau> lists = new ArrayList<>();
//        List<String> strings = readFile.ReadFile(FILE_PATH);
//        for (String str : strings) {
//            String[] temp = str.split(",");
//            String idsanpham = temp[0];
//            String masanpham = temp[1];
//            String tensanpham = temp[2];
//            String giaban = temp[3];
//            String soluong = temp[4];
//            String nhasanxuat = temp[5];
//            String giaxuatkhau = temp[6];
//            String quocgianhapkhau = temp[7];
//            SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(idsanpham, masanpham, tensanpham, giaban, soluong, nhasanxuat, giaxuatkhau, quocgianhapkhau);
//            lists.add(sanPhamXuatKhau);
//        }
//        return lists;
//
//
//        @Override
//        public List findAll () {
//            return lists;
//        }
//    }
//
//    @Override
//    public void timKiemID(int id) {
//
//    }
//
//    @Override
//    public void tinKiemTen(String name) {
//
//    }
//}
