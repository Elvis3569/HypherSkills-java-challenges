import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String input = scanner.nextLine();
            if ("0".equals(input))
                break;

            try {
                int value = Integer.parseInt(input) * 10;
                System.out.println(value);
            } catch(Exception e) {
                System.out.println("Invalid user input: " + input );
            }
        }


    }
}