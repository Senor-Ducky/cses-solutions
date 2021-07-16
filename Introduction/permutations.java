import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        long n=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();

        if(n == 1) {
            System.out.print(1);
            return;
        }

        if(n > 3) {
            for(int i=2; i<=n; i+=2) {
                System.out.print(" "+i);
            }

            for(int i=1; i<=n; i+=2) {
                System.out.print(" "+i);
            }
        } else {
            System.out.println("NO SOLUTION");
        }
    }
}
