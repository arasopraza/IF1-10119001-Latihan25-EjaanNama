import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini menampilkan ejaan nama
 * dari inputan user
 */

public class EjaanNama {
    public static void main(String[] args) {
        int i,j,panjangNama;
        String nama;
        char huruf;
        Scanner scanner;

        System.out.print("Masukkan nama depan anda untuk di eja : ");
        scanner = new Scanner(System.in);
        nama = scanner.nextLine();

        System.out.print("\n");
        System.out.println("Ejaan untuk " + "\"" + nama + "\"" + " adalah : ");
        panjangNama = nama.length();

        i = 0;
        j = 1;
        do {
            huruf = nama.charAt(i);
            System.out.println("Huruf ke-" + j + " : " + huruf);
            i++;
            j++;
        } while (i < panjangNama);
    }
}
