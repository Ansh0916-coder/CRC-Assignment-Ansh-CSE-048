
import java.util.Scanner;

    public class read {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int i = sc.nextInt();
            float f = sc.nextFloat();
            char c = sc.next().charAt(0);

            System.out.println("Integer: " + i);
            System.out.println("Float: " + f);
            System.out.println("Char: " + c);

            sc.close();
        }
    }
