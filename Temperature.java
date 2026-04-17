import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float c = sc.nextFloat();
        float f = (c * 9/5) + 32;

        System.out.println("Celsius to Fahrenheit: " + f);

        float f2 = sc.nextFloat();
        float c2 = (f2 - 32) * 5/9;

        System.out.println("Fahrenheit to Celsius: " + c2);

        sc.close();
    }
}