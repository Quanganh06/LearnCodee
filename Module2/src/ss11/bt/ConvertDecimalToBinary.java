package ss11.bt;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> numStack = new Stack<Integer>();
        System.out.println("Nhập số nguyên cần chuyển :");
        String number = sc.nextLine();
        int num = Integer.parseInt(number);
        for (; num > 0; ) {
            int temp = num % 2;
            numStack.push(temp);
            num = num / 2;
        }
        System.out.println("Dãy nhị phân la : ");
        for (; !numStack.isEmpty(); ) {
            System.out.print(numStack.pop());
        }
        sc.close();

    }
}
