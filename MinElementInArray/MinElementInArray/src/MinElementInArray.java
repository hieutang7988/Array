import java.util.Scanner;

public class MinElementInArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number");
            size = scanner.nextInt();
            if(size <= 0)
                System.out.println("Size should not eceleed > 0");

        } while ( size <= 0);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        // in các phần tử đã nhập
        System.out.println("Property list: ");
        for(int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int min = array[0];
         int index = 1;
         for ( i = 0; i < array.length;i++) {
             if (min > array[i])
                  min = array[i];
             index = i + 1;
         }
        System.out.println(" Min element in array of value = " + min +" ,at position " + index);
    }
}
