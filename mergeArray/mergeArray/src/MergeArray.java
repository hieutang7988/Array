import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int size2;
        int array1[];
        int array2[];
        int array3 [];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size 1 :");
            System.out.println("Enter a size 2");
            size1 = scanner.nextInt();
            size2 = scanner.nextInt();
        } while (size1 <= 0 && size2 <= 0);
        array1 = new int[size1];
        array2 = new int[size2];
        int i = 0;
        while (i < array1.length) {
            System.out.println("Enter element array 1 : " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }

        int j = 0;
        while (j < array2.length) {
            System.out.println("Enter element array 2 : " + (j + 1) + ": ");
            array2[j] = scanner.nextInt();
            j++;
        }

        System.out.printf("\n%-20s%s", "Elements in array 1: ", " ");
            for (j = 0; j < array1.length; j++) {
                System.out.print(array1[j] + "");
        }
        System.out.printf("\n%-20s%s", "Elements in array 2: ", " ");
            for (i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + "");
            }
         array3 = new int [size1 + size2];
            for ( i = 0; i < array1.length; i++ ) {
             array3[i] =  array1[i] ;
            }
            for ( j = array1.length; j < array3.length ; j++ ) {
                array3[j] = array2[j - size1];
            }
        System.out.printf("\n%-20s%s", "New array: ", "");
            for ( i = 0 ; i < array3.length; i++) {
                System.out.print(array3[i] + "\t");
            }
    }
}

