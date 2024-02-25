package btontap;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xoá sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Đọc/Ghi file");
            System.out.println("5. Hiển thị danh sách sinh viên");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự xuống dòng cuối cùng

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    deleteStudent(scanner);
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    saveAndLoadData(scanner);
                    break;
                case 5:
                    displayStudents();
                    break;
                case 6:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }

            System.out.println();
        } while (choice != 6);
    }

    public static void addStudent(Scanner scanner) {
        System.out.println("----- Thêm sinh viên -----");

        System.out.print("Họ và tên: ");
        String name = scanner.nextLine();

        System.out.print("Tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng cuối cùng
        System.out.println("Id: ");

        int id=scanner.nextInt();
        Student student = new Student(name, age,id);
        students.add(student);

        System.out.println("Đã thêm sinh viên thành công!");
    }

    public static void deleteStudent(Scanner scanner) {
        System.out.println("----- Xoá sinh viên -----");

        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
            return;
        }

        System.out.print("Nhập tên sinh viên cần xoá: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                students.remove(student);
                System.out.println("Đã xoá sinh viên thành công!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có tên \"" + name + "\".");
        }
    }

    public static void searchStudent(Scanner scanner) {
        System.out.println("----- Tìm kiếm sinh viên -----");

        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
            return;
        }

        System.out.print("Nhập tên sinh viên cần tìm: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có tên \"" + name + "\".");
        }
    }

    public static void saveAndLoadData(Scanner scanner) {
        System.out.println("----- Đọc/Ghi file -----");
        System.out.println("1. Ghi danh sách sinh viên vào file");
        System.out.println("2. Đọc danh sách sinh viên từ file");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng cuối cùng

        switch (choice) {
            case 1:
                saveStudentsToFile();
                break;
            case 2:
                DocFile();
                loadStudentsFromFile();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
        }
    }

    public static void saveStudentsToFile() {
        try {
            FileWriter writer = new FileWriter("/Users/macbook/Desktop/Module-II/students.txt");

            for (Student student : students) {
                writer.write(student.getName() + "," + student.getAge() + "\n");
            }

            writer.close();
            System.out.println("Đã ghi danh sách sinh viên vào file thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào file!");
            e.printStackTrace();
        }
    }

    public static void loadStudentsFromFile() {
        try {
            FileReader reader = new FileReader("/Users/macbook/Desktop/scv.xlsx");
            BufferedReader bufferedReader = new BufferedReader(reader);

            students.clear();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] studentData = line.split(",");
                String name = studentData[0];
                int age = Integer.parseInt(studentData[1]);
                int id=Integer.parseInt(studentData[1]);
                Student student = new Student(name, age,id);
                students.add(student);
            }

            reader.close();
            System.out.println("Đã đọc danh sách sinh viên từ file thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc từ file!");
            e.printStackTrace();
        }
    }
public static void DocFile(){
    File f = new File("/Users/macbook/Desktop/Module-II/students.txt");
    try {
        BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
        String line = null;
        while (true) {
            line = br.readLine();
            if (line==null){
                break;
            }else {
                System.out.println(line);
            }

        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
            return;
        }

        System.out.println("----- Danh sách sinh viên -----");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int age;
    private  int id;

    public Student(String name, int age,int id) {
        this.name = name;
        this.age = age;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Họ và tên: " + name + ", Tuổi: " + age+",Id: ";
    }
}
