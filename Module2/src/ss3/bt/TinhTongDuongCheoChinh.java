package ss3.bt;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };

        double sum = 0.0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Tổng đường chéo chính: " + sum);
    }
}
