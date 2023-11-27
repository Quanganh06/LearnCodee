package ss11.bt;

import java.util.Scanner;
import java.util.Stack;

public class Bracketchecker {
    public static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']') || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 bieu thuc: ");
        String expression1 = scanner.nextLine();
        System.out.println("Biểu thức 1 -  Dấu ngoặc trong bieu thuc la : " + checkBrackets(expression1));

    }
}

