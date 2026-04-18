import java.util.*;
class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        char c[] = new char[a.length() + b.length()];

        int k = 0;

        for(int i=0;i<a.length();i++){
            c[k++] = a.charAt(i);
        }
        for(int i=0;i<b.length();i++){
            c[k++] = b.charAt(i);
        }
        System.out.print("Concatenated String: ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
    }
}