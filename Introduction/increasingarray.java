import java.util.*;
 
public class increasingarray {
    public static void main(String[] args) {
        int n;
        long result=0;
        long operations=0;
        Scanner sc = new Scanner(System.in);
 
        n = sc.nextInt();
 
        long[] arr = new long[n+1];
 
        for(int i=1; i<arr.length; i++) {
            arr[i] = sc.nextLong();
            
            if(arr[i] < arr[i-1]) {
                 result= arr[i-1] - arr[i];
                 arr[i] = result+arr[i];
                 operations = operations+result;
            }
 
        }
        System.out.println(operations);
    }
}