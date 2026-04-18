import java.util.*;
class Call {
    static void change(int a){
        a = a + 10;
        System.out.println("Inside function: " + a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        change(a);
        System.out.println("Outside function: " + a);
    }
}