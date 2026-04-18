import java.util.*;

class Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b[] = new char[a.length()];
        for(int i=0;i<a.length();i++){
            b[i] = a.charAt(i);
        }
        System.out.print("Copied String: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
    }
}