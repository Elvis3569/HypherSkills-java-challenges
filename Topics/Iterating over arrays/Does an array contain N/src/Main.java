import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int i : arr) {
            if (i == n) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
