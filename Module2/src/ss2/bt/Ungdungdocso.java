package ss2.bt;

import java.util.Scanner;

public class Ungdungdocso {
    public static String toEnglish(int number) {
        String[] talk = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String num = String.valueOf(number);
        StringBuilder english = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            english.append(talk[digit]);
            if (i < num.length() - 1) {
                english.append("");
            }
        }
        return english.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so: ");
        int num = scanner.nextInt();
        String englishNumber = toEnglish(num);
        System.out.println("Read of " + num + " by English " + englishNumber);
    }
}

