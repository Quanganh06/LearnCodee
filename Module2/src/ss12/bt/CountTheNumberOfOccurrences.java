package ss12.bt;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CountTheNumberOfOccurrences {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi van ban: ");
        String text=sc.nextLine();
        String stringWord=text.toLowerCase(Locale.ROOT);
        String [] words=text.split("\\s+");
        for (String strings:words){
            if (map.containsKey(strings)){
                map.put(strings,map.get(strings)+1);
            }else {
                map.put(strings,1);
            }
        }
        System.out.println(map);

    }
}
