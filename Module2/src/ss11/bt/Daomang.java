package ss11.bt;

import java.util.Scanner;
import java.util.Stack;

public class Daomang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String>numStack=new Stack<String>();
        System.out.println("Nhập mảng số nguyên  :");
        String numbers = sc.nextLine();
        String[] numberArray =  numbers.split(",");
        for(int i = 0;i<numberArray.length;i++) {
            numStack.push(numberArray[i]);
        }
        for(int i = 0;i<numberArray.length;i++) {
            numberArray[i]= numStack.pop();
        }
        System.out.println("Mang đảo ngược là : ");
        System.out.print(String.join(",", numberArray));
        sc.close();
    }
}
