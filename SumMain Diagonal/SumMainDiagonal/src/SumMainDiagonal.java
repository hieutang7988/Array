import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        int rows , colums;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number rows :");
        rows = scanner.nextInt();
        System.out.println("Input number colums :");
        colums = scanner.nextInt();
        int Array [][] = new int[rows][colums];
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < colums; j++) {
                System.out.println("Enter element number [" + i + ", " + j + "]: ");
                Array[i][j] = scanner.nextInt();
            }
        }

        System.out.println(" Array your input :");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < colums; j++) {
                System.out.println(Array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for(int i = 0; i < Array.length; i++) {
            for ( int j = 0; j < Array.length;j++) {
                if(i == j)
                    sum += Array[i][j];
            }
        }
        System.out.println(" Sum element in main diagonal =" + sum);
    }
}
