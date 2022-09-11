public class Main {
    public static int sum(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int sum1_10 = sum(1,10);
        System.out.println("Sum của 1-10 :"+sum1_10);
        int sum20_40 = sum(20,40);
        System.out.println("Sum của 20-40 :"+sum20_40);
        int sum70_90 = sum(70,90);
        System.out.println("Sum của 70-90 :"+sum70_90);
    }
}
