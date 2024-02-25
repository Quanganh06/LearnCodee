package ss13.bt;

import java.util.*;

public class Timchuoi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String inputString = scanner.nextLine();
        List<String> substrings = getSubstrings(inputString);
        Collections.sort(substrings, Comparator.comparingInt(String::length).reversed());
        System.out.println("Chuoi con sau khi sap xep la: ");
        for (String substring:substrings){
            System.out.println(substring);
        }
    }
    private static List<String>getSubstrings(String inputString){
        List<String>substrings=new ArrayList<>();
        String[]words= inputString.split("\\s+");
        Collections.addAll(substrings,words);
        return substrings;
    }
}
