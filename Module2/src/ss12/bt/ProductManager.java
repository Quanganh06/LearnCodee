package ss12.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager extends Product {
    private static List<Product> products = new ArrayList<>();

    public static void addProduct(Scanner scanner) {
        System.out.println("----- Thêm sản phẩm -----");
        System.out.print("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name Product: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = scanner.nextInt();
        Product newProduct = new Product(id, name, price);
        products.add(newProduct);
        System.out.println("Thêm sản phẩm thành công !");
    }

    public static void displayProduct() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng!");
            return;
        }
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static void deleteProduct(Scanner scanner) {
        System.out.println("----- Xóa sản phẩm -----");
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng!");
            return;
        }
        System.out.print("Nhập id sản phẩm cần xóa: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                System.out.println("Xóa sản phẩm thành công!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có id " + id);
        }
    }



//    public static void updateProduct(Scanner scanner) {
//        System.out.println("-----Sua thong tin san pham-----");
//        System.out.println("Nhap id san pham can sua:  ");
//        int id = Integer.parseInt(scanner.nextLine());
//
//    }
//
//    public static void searchProduct(Scanner scanner) {
//        System.out.println("----Tim kiem san pham----");
//        if (products.isEmpty()) {
//            System.out.println("Khong co san pham nay:  ");
//            return;
//        }
//        System.out.println("Nhap id san pham can tim: ");
//        int id = scanner.nextInt();
//    boolean found=false;
//  for (int i=0;i< products.size();i++){
//      System.out.println(products.get(i));
//        if (){
//            System.out.println(ProductManager.products);
//            found=true;
//            break;
//        }
//        if (!found){
//            System.out.println("ko co san pham nay! "+ id);
//        }
//    }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thi sản phẩm  ");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Sửa thộng tin sản phẩm theo id ");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần,giảm dần theo giá");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addProduct(scanner);
                case 2:
                   displayProduct();
                case 3:
                    deleteProduct(scanner);
//                case 4:
//                    updateProduct(scanner);
//                case 5:
//                    searchProduct(scanner);

            }
            System.out.println();
        } while (choice != 7);
    }
}
