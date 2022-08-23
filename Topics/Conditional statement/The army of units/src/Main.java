import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int noOfArmy = scanner.nextInt();

        if(noOfArmy < 1)
            System.out.println("no army");
        else if (noOfArmy >= 1 && noOfArmy <= 19)
            System.out.println("pack");
        else if (noOfArmy >= 20 && noOfArmy <= 249)
            System.out.println("throng");
        else if (noOfArmy >= 250 && noOfArmy <= 999)
            System.out.println("zounds");
        else System.out.println("legion");
    }
}