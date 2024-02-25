package ThiModule2.service.impl;

import ThiModule2.model.TkThanhtoan;
import ThiModule2.model.TkTietkiem;
import ThiModule2.repository.ITKbankRepository;
import ThiModule2.repository.ITkthanhtoan;
import ThiModule2.repository.imp.TKbankRepository;
import ThiModule2.repository.imp.TKtietkiemRepository;
import ThiModule2.repository.imp.TkThanhtoanrepository;
import ThiModule2.service.ITKBankService;

import java.util.List;
import java.util.Scanner;

public class TKbankService implements ITKBankService {
    ITKbankRepository tKbankRepository = new TKbankRepository();

    ITkthanhtoan tkThanhtoanrepository = new TkThanhtoanrepository();
    ITKbankRepository tKtietkiemRepository = new TKtietkiemRepository();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void themmoi() {
        boolean flag = true;
        do {
            System.out.println("Chon chuc nang theo so (de tiep tuc): ");
            System.out.println(" 1.TK thanh toan" +
                    "\n 2. TK tiet kiem" +
                    "\n 3. thoat");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.printf("Nhap id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap ma TK: ");
                    String mabtk = scanner.nextLine();
                    System.out.println("Nhap ten tk: ");
                    String tentk = scanner.nextLine();
                    System.out.println("Ngay ngay tao tai khoan : ");
                    String ngaytaotk = scanner.nextLine();
                    System.out.println("Nhap so the: ");
                    int sothe = scanner.nextInt();
                    System.out.println("Nhap so tien trong tai khoan: ");
                    double sotien = scanner.nextInt();
                    TkThanhtoan tkThanhtoan = new TkThanhtoan(id, mabtk, tentk, ngaytaotk, sothe, sotien);




                    break;
                case 2:
                    System.out.printf("Nhap id: ");
                    int id1 = scanner.nextInt();
                    System.out.println("Nhap ma TK: ");
                    String mabtk1 = scanner.nextLine();
                    System.out.println("Nhap ten tk: ");
                    String tentk1 = scanner.nextLine();
                    System.out.println("Ngay ngay tao tai khoan : ");
                    String ngaytaotk1 = scanner.nextLine();
                    System.out.println("Nhap so tien gui tiet kiem: ");
                    double sotien1 = scanner.nextInt();
                    System.out.println("Nhap ngay gui tiet kiem: ");
                    String ngaygui = scanner.nextLine();
                    System.out.println("Nhap lai suat: ");
                    double lai = scanner.nextInt();
                    System.out.println("Nhap ki han: ");
                    String kihan = scanner.nextLine();
                    TkTietkiem tkTietkiem = new TkTietkiem(id1, mabtk1, tentk1, ngaytaotk1, sotien1, ngaygui, lai, kihan);

                    break;
                case 3:
                    flag = false;
                    break;

            }
        } while (flag);

    }

    @Override
    public void xoa() {
        System.out.println("Nhap maTk can xoa: ");
        String matk = scanner.nextLine();
        tKbankRepository.xoa(matk);
    }

    @Override
    public void hienthimenu() {
        boolean flag = true;
        do {
            System.out.println("Chon chuc nang theo so (de tiep tuc): ");
            System.out.println(" 1. hien thi tk thanh toan" +
                    "\n 2. hien thi tk tiet kiem" +
                    "\n 3. thoat");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    List<TkThanhtoan> tkThanhtoanList = tkThanhtoanrepository.hienthidanhsach();
                    for (int i = 0; i < tkThanhtoanList.size(); i++) {
                        if (tkThanhtoanList.get(i) != null) {
                            System.out.println((i + 1) + "." + tkThanhtoanList.get(i));
                        }
                    }
                    break;
                case 2:
                    List<TkTietkiem> tkTietkiemList = tKtietkiemRepository.hienthidanhsach();
                    for (int i = 0; i < tkTietkiemList.size(); i++) {
                        if (tkTietkiemList.get(i) != null) {
                            System.out.println((i + 1) + "." + tkTietkiemList.get(i));
                        }
                    }
                    break;
                case 3:
                    flag = false;
            }
        } while (flag);

    }


}

