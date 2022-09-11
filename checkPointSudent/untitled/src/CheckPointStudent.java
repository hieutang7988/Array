import java.util.Scanner;

public class CheckPointStudent {

    public static void main(String[] args) {
        int size;
        double[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not eceleed > 0");

        } while (size > 30);
        array = new double[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextDouble();
            i++;
        }
        // in các phần tử đã nhập
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int count = 0;
        for (  i = 0; i < array.length; i++) {
        if(array[i] > 5 && array[i] <=10)
            count++;
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}