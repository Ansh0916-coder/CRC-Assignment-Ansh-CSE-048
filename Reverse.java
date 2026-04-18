import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), rev = 0,d;

        while (n != 0) {
            d= n%10;
            rev = d + rev * 10;
            n /= 10;
        }

        System.out.println("Reversed: " + rev);
    }
}