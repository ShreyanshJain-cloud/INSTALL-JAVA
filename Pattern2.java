import java.util.*;

public class Pattern2 {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j); // + " ");//for good look
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pattern(t);
    }
}
