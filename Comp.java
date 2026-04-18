import java.util.*;
class Comp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        boolean equal = true;

        if(a.length() != b.length()){
            equal = false;
        } else {
            for(int i=0;i<a.length();i++){
                if(a.charAt(i) != b.charAt(i)){
                    equal = false;
                    break;
                }
            }
        }
        if(equal)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}