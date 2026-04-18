import java.util.*;
class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a[] = new String[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].compareTo(a[j]) > 0){
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted Strings:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}