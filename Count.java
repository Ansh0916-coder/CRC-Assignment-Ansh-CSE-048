import java.util.*;
class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int v=0,c=0,d=0,s=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch))
                d++;
            else if(Character.isWhitespace(ch))
                s++;
            else if("aeiouAEIOU".indexOf(ch)!=-1)
                v++;
            else if(Character.isLetter(ch))
                c++;
        }
        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
        System.out.println("Digits = " + d);
        System.out.println("Spaces = " + s);
    }
}