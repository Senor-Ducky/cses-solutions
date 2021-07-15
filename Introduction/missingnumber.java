import java.util.*;

public class missingnumber {
    public static void main(String[] args) {
        long n,x, m=0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=0; i<n-1; i++) {
            x=sc.nextInt();
            m = m+x;
        }

        long result = n*(n+1)/2 - m;

        System.out.println(result);
        
    }
}
