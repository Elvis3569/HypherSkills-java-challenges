import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner s = new Scanner(System.in);
        String[] arr = s.nextLine().split(" ");
        var result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1].compareTo(arr[i]) < 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);


    }

}