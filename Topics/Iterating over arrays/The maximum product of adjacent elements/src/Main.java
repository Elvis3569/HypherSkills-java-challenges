import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int product = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr.length < 2) {
                System.out.println("This is an incomplete array");
            }
            int i1 = arr[i] * arr[i + 1];
            if (i1 > product) {
                product = i1;
            }
        }
        System.out.println(product);
    }
}