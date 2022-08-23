import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int value = scanner.nextInt();
        
        final int digit1 = -15;
        final int digit2 = 12;
        final int digit3 = 14;
        final int digit4 = 17;
        final int digit5 = 19;
        boolean interval1 = value > digit1 && value <= digit2;
        boolean interval2 = value > digit3 && value < digit4;
        boolean interval3 = value >= digit5;
        

        if (interval1 || interval2 || interval3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
