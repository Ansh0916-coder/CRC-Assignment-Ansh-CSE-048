import java.util.*;
class ReverseLink{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> a=new LinkedList<>();
        int n=sc.nextInt();
        while(n-->0) {
            a.add(sc.nextInt());
        }
        Collections.reverse(a);
        System.out.println(a);
    }
}