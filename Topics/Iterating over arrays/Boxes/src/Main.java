import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        final  int size = 3;

        int[] box_1 = new int[size];
        int[] box_2 = new int[size];

        System.out.println("Input box 1");
        for (int i = 0; i < size; i++) {
            box_1[i] = scanner.nextInt();
        }

        System.out.println("Input box 2");
        for (int i = 0; i < size; i++) {
            box_2[i] = scanner.nextInt();
        }

        if (box_1[0] < box_2[0] && box_1[1] < box_2[1] && box_1[2] < box_2[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (box_1[0] > box_2[0] && box_1[1] > box_2[1] && box_1[2] > box_2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if(box_1 == box_2) {
            System.out.println("Incompatible");
        }

    }
}