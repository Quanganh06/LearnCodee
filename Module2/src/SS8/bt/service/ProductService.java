package SS8.bt.service;

import SS8.bt.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements ImpService {
    private ImpService impService = new ProductService();
    private static Scanner scanner=new Scanner(System.in);
    private static List<Product> productList=new ArrayList<>();
    public ProductService() {
    }

    @Override
    public void add() {
        System.out.println("----Them san pham---=");

        System.out.println("Nhap id: ");
        int id = scanner.nextInt();
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham: ");
        int price = scanner.nextInt();
        Product product=new Product(id,name,price);
        productList.add(product);
        System.out.println("Them san pham thanh cong !");


    }



    @Override
    public void delete() {
        System.out.println("Nhap id can xoa: ");
        int id=scanner.nextInt();



    }

    @Override
    public void update() {

    }

    @Override
    public void dislpay() {

    }
}
