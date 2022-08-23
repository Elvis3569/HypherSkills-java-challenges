import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        final int sumUp = 20;

        if (num1 + num2 == sumUp || num1 + num3 == sumUp || num2 +
            num3 == sumUp) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
