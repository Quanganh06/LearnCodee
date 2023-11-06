package ss3.bt;

public class timsonhonhat {
    public static void main(String[] args) {
        double[] numberArr = { -2,-12,4,11,32};
        double min = numberArr[0];
        System.out.println("\nCác phần tử trong mảng là: ");
        for(double i : numberArr){
            System.out.print(i + ", ");
        }
        for (double num: numberArr) {
            if(min > num)
                min = num;
        }
        System.out.printf("\nSố nhỏ nhất trong mảng là: " +min);
    }
}
