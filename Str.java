import java.util.*;

class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = 0;
        for(char ch : str.toCharArray()){
            len++;
        }
        System.out.println("Length = " + len);
    }
}