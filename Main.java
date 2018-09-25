import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        if ((v1 % 4 == 0 && v1 % 100 != 0) || (v1 % 400 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
