import java.util.*;
class Function {
    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static boolean isArmstrong(int n){
        int sum=0, temp=n;
        while(temp>0){
            int d=temp%10;
            sum += d*d*d;
            temp/=10;
        }
        return sum==n;
    }
    static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+=i;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

        if(isArmstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
        if(isPerfect(n))
            System.out.println("Perfect");
        else
            System.out.println("Not Perfect");
    }
}