import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int daysDuration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        int sum = (foodCostPerDay * daysDuration) +
                (flightCost * 2) + (hotelCostPerNight * (daysDuration - 1));

        System.out.println(sum);
    }
}