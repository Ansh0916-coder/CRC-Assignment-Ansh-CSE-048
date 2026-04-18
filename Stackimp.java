import java.util.*;
class Stackimp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> a=new Stack<>();
        int n=sc.nextInt();
        while(n-->0)
            a.push(sc.nextInt());
        a.pop();
        System.out.println(a);
    }
}