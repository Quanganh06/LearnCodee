package btontap;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Edit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự xuống dòng cuối cùng

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }

            System.out.println();
        } while (choice != 4);
    }

    public static void addStudent() {
        try {
            FileWriter writer = new FileWriter("danhsachsinhvien.txt", true);

            Scanner scanner = new Scanner(System.in);
            System.out.println("----- Thêm sinh viên -----");

            System.out.print("Họ và tên: ");
            String name = scanner.nextLine();
            System.out.print("Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự xuống dòng cuối cùng

            writer.write("Họ và tên: " + name + ", Tuổi: " + age + "\n");
            writer.close();

            System.out.println("Đã thêm sinh viên thành công!");

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào tệp!");
            e.printStackTrace();
        }
    }

    public static void displayStudents() {
        try {
            FileReader reader = new FileReader("danhsachsinhvien.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            System.out.println("----- Danh sách sinh viên -----");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc tệp!");
            e.printStackTrace();
        }
    }

    public static void editStudent() {
        try {
            FileReader reader = new FileReader("danhsachsinhvien.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            StringBuilder fileContent = new StringBuilder();
            String line;

            System.out.println("----- Chỉnh sửa thông tin sinh viên -----");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                fileContent.append(line).append("\n");
            }

            reader.close();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số thứ tự sinh viên cần chỉnh sửa: ");
            int studentIndex = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự xuống dòng cuối cùng

            System.out.print("Họ và tên mới: ");
            String newName = scanner.nextLine();
            System.out.print("Tuổi mới: ");
            int newAge = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự xuống dòng cuối cùng

            String[] students = fileContent.toString().split("\n");
            if (studentIndex >= 1 && studentIndex <= students.length) {
                String[] studentData = students[studentIndex - 1].split(", ");

                studentData[0] = "Họ và tên: " + newName;
                studentData[1] = "Tuổi: " + newAge;

                students[studentIndex - 1] = String.join(", ", studentData);

                FileWriter writer = new FileWriter("danhsachsinhvien.txt");
                for (String student : students) {
                    writer.write(student + "\n");
                }

                writer.close();

                System.out.println("Đã cập nhật thông tin sinh viên thành công!");

            } else {
                System.out.println("Số thứ tự sinh viên không hợp lệ!");
            }


        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc hoặc ghi vào tệp!");
            e.printStackTrace();
        }
    }
}
