import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Berapa banyak elemen yang ingin dimasukkan?");
        int jumlahElemen = input.nextInt();

        int[] ar = new int [jumlahElemen];
        int sum = 0;

        for (int i = 0; i < ar.length ; i++) {
            if (i == 0) {
                System.out.println("Masukkan elemen pertama:");
            } else if (i == 1) {
                System.out.println("Masukkan elemen kedua:");
            } else if (i == ar.length - 1) {
                System.out.println("Masukkan elemen terakhir:");
            } else {
                System.out.println("Masukkan elemen ke-" + (i + 1) + ":");
            }

            ar[i] = input.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        System.out.println("Jumlah seluruh elemen array adalah: " + sum);
        }
    }


