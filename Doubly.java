import java.util.*;
class Doubly{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> a=new LinkedList<>();
        int n=sc.nextInt();
        while(n-->0)
            a.add(sc.nextInt());

        a.addFirst(100);
        a.addLast(200);

        System.out.println(a);
    }
}