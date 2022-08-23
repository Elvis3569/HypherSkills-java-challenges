import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String word = scanner.next();

        String newWord = word.replaceAll("a", "b");

        System.out.println(newWord);
    }
}
