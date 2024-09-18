import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata dalam camelCase:");
        String input = scanner.next();

        int wordCount = 1;

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                wordCount++;
            }
        }

        System.out.println("Jumlah kata dalam camelCase : " + wordCount);
    }
}
