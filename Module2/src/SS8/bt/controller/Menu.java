package SS8.bt.controller;
import SS8.bt.service.ImpService;
import SS8.bt.service.ProductService;


import java.util.Scanner;

public class Menu {
    ImpService productService=new ProductService();

    private static Scanner scanner=new Scanner(System.in);
    int choice;

    {
        System.out.println("1.Them moi");
        System.out.println("2.Xoa");
        System.out.println("3.Chinh sua");
        System.out.println("4.Hien Thi");
        System.out.println("5.Thoat");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("---Them Moi---");
                productService.add();
                break;
            case 2:
                System.out.println("----Xoa----");
                productService.delete();
                break;
            case 3:
                System.out.println("----Chinh sua----");
                productService.update();
                break;
            case 4:
                System.out.println("----Hien thi----");
                productService.dislpay();
                break;
            case 5:
                System.out.println("Thoat");
                break;
            default:
                System.out.println("Lua chon ko hop le.Vui long chon lai !");

        }
        System.out.println();
    }
    }


