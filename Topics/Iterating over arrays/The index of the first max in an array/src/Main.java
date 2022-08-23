
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int highest =  0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                highest = i;
            }
        }

        System.out.println(highest);
    }
}
