import java.util.*;
class Deq{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Deque<Integer> a=new ArrayDeque<>();
        int n=sc.nextInt();
        while(n-->0)
            a.push(sc.nextInt());
        a.pop();
        System.out.println(a);
    }
}