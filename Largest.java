import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int lar;
        if (a >= b && a >= c)
            lar = a;
        else if (b >= a && b >= c)
            lar = b;
        else
            lar = c;
        System.out.println("Largest: " + lar);
        sc.close();
    }
}