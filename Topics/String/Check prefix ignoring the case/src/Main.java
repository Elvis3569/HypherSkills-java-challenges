import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String str = scanner.next();
        char res = str.charAt(0);
        if (str.substring(0,1).equalsIgnoreCase("j")) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}