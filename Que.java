import java.util.*;
class Que {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> a=new LinkedList<>();
        int n=sc.nextInt();
        while(n-->0)
            a.add(sc.nextInt());
        a.poll();
        System.out.println(a);
    }
}