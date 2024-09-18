import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan ukuran tangga: ");
        int n = input.nextInt();

        int i = 1;
        do {
            int j = n - 1;
            do {
                System.out.println(" ");
                j--;
            } while (j > 0);

            int k = 1;
            do {
                System.out.println("#");
                k++;
            } while (k <= i);
            System.out.println();
            i++;
        } while  (i <= n);
        input.close();
    }
}
