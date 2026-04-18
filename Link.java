import java.util.*;
class Link{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> a=new LinkedList<>();
        int n=sc.nextInt();
        while(n-->0)
            a.add(sc.nextInt());

        System.out.println(a);
        a.remove((Integer)sc.nextInt());
        System.out.println(a);
    }
}