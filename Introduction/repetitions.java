import java.util.*;

class repetitions {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        char[] c = s.toCharArray();
        int maxi = 1;
        int count = 1;

        for(int i=1; i<c.length; i++) {
            if(c[i] == c[i-1]) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 1;
            }
        }

        System.out.println(maxi);
        }
}
