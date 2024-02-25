package ss16.bt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Copyfile {
    public static void main(String[] args) {
        String filePath = "";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] values = line.split(",");

                if (values.length == 3) {
                    int id = Integer.parseInt(values[0].trim());
                    String code = values[1].trim();
                    String name = values[2].trim();

                    System.out.println("ID: " + id);
                    System.out.println("Code: " + code);
                    System.out.println("Name: " + name);
                    System.out.println();
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp tin");
        }
    }
}
