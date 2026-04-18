public class Insert {
    public static void main(String[] args){
        int[] arr = new int[6];
        arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4; arr[4]=5;

        int pos = 2, val = 99;

        for (int i = arr.length - 1; i > pos; i--)
            arr[i] = arr[i - 1];

        arr[pos] = val;

        for (int i : arr)
            System.out.print(i + " ");
    }
}
