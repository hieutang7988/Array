import java.util.Scanner;
public class RemoveIndexArray {
    public static void main(String[] args) {
        int[] number = {10, 4, 6, 7, 8, 0 , 12 , 15, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int input_number = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == (input_number)) {
                System.out.println("Number :" + input_number + "\n" + "index :" + i);
                check = true;
                }
            }
        System.out.printf("\n%-20s%s", "Elements in array: ", "\t");
        for (int j = 0; j < number.length; j++) {
            System.out.print(number[j] + "\t");
        }

        System.out.println("Mảng còn lại sau khi xóa phần tử " + input_number + " là: ");
        for ( int i = 0; i < number.length; i++) {
            if (number[i] != input_number)
            System.out.print(number[i] + "\t");
        }
    }
}






