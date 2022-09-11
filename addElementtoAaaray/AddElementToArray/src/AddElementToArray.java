import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size array :");
            size = scanner.nextInt();
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("\n%-20s%s", "Elements in array: ", "\t");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "");
        }
        System.out.println("Nhập số nguyên x: ");
        int x = scanner.nextInt();
        System.out.println("Index :");
        int index = scanner.nextInt();
        int myArray[] = new int[size + 1];
            for (int k = 0; k < index; k++) {
            myArray[k] = array[k];
            myArray[index] = x;
        }
        for (int f = index + 1; f < size + 1; f++) {
            myArray[f] = array[f -1];
        }
        System.out.printf("\n%-20s%s", "New array: ", "");
        for (int j = 0; j < size +1 ; j++) {
            System.out.print(myArray[j] + "\t");
        }
    }
}

