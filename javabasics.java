
/*import java.util.*;

public class javabasics {
    public static void main(String args[]) {
n
        // System.out.println(" Hello world");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

    }
}*/
import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("Input should be an integer.");
            // Optionally, you may choose to handle or log the exception further.
        }
    }
}
