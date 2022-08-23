import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 1;

        ArrayList<Integer> getCount = new ArrayList<>();

        if (arr.length == 1) {
            getCount.add(count);

        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    count++;
                } else {
                    getCount.add(count);
                    count = 1;
                }
            }
            getCount.add(count);
        }
        int result = Collections.max(getCount);
        System.out.println(result);

    }
}
