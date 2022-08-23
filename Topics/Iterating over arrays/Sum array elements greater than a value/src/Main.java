import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int arrLen = scanner.nextInt();
        int[] arr = new int[arrLen];
        
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int i : arr) {
            if (i > n) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
