import java.util.Scanner;

public class SumColums {
    public static void main(String[] args) {
        int rows, colums;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number rows :");
        rows = scanner.nextInt();
        System.out.println("Input number colums :");
        colums = scanner.nextInt();
        int Array[][] = new int[rows][colums];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.println("Enter element number [" + i + ", " + j + "]: ");
                Array[i][j] = scanner.nextInt();
            }
        }

        System.out.println(" Array your input :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.println(Array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for(int column = 0; column < Array.length; column++){
            int total = 0;
            for(int row = 0; row < Array.length; row++){
                total += Array[row][column];
            }
            System.out.println("Sum for column " + column + " is " + total);
        }
    }
}
