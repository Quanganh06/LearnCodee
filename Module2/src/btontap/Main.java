package btontap;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Yêu cầu người dùng nhập thông tin
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thông tin: ");
        String inputData = scanner.nextLine();

        try {
            // Ghi thông tin vào tệp
            FileWriter writer = new FileWriter("data.txt");
            writer.write(inputData);
            writer.close();
            System.out.println("Đã ghi vào tệp thành công!");

            // Đọc thông tin từ tệp
            FileReader reader = new FileReader("data.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Nội dung trong tệp:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi hoặc đọc tệp!");
            e.printStackTrace();
        }
    }
}
