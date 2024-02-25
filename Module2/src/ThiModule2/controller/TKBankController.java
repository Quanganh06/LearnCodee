package ThiModule2.controller;

import ThiModule2.service.impl.TKbankService;

import java.util.Scanner;

public class TKBankController {
    public static void displaymenu(){
        TKbankService tKbankService=new TKbankService();
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println(" 1.Them moi" +
                    "\n 2. Xoa" +
                    "\n 3. Xem danh sach tk"+
                    "\n 4. thoat" );
            System.out.println("Nhap chuc nang: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("1. them moi ");
                    tKbankService.themmoi();
                    break;
                case 2:
                    System.out.println(" 2. Xoa");
                    tKbankService.xoa();
                    break;
                case 3:
                    System.out.println("3. Xem danh sach cac tk");
                    tKbankService.hienthimenu();
                    break;

                case 4:
                    flag = false;
            }

        }while (flag);
    }
}
