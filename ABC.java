public class ABC {
    public static void main(String args[])

    {
        // char counter = 'A';
        // int j = 1;
        // counter++;

        for (int i = 1; i <= 3; i++) {
            char counter = 'A';
            int j = 1; // for (int j = 1; j <= 3; j++)
            do {
                System.out.print(counter + " ");
                counter++;
                j++;
            } while (j <= 3);
            System.out.println();
        }
    }
}
