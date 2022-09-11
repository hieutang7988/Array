import java.util.Scanner;
public class CountCharAt {
    public static void main(String[] args) {
        String mystring;
        char myChar ;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        mystring = scanner.nextLine();
       System.out.println("Nhập vào ký tự bất kỳ :");
        myChar = scanner.next().charAt(0);


        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < mystring.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (mystring.charAt(i) == myChar) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + myChar +
                " trong chuỗi " + mystring + " = " + count);
    }
}
