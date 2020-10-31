
package pbo10119012latihan28;


import java.util.Scanner;
/**
 *
 * @author damai
 * NAMA   : DAMAI SAPUTRA LAOLI
 * KELAS  : IF-1
 * NIM    : 10119012
 */
public class PBO10119012Latihan28 {

    
    public static void main(String[] args) {
         String hasil = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        String kata_lama = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        String kata_baru = scanner.nextLine();
        String[] perkata = kalimat.split(" ");
        for (String kata : perkata) {
            if (kata.equalsIgnoreCase(kata_lama)) {
                hasil += kata_baru + " ";
            }
            else {
                hasil += kata + " ";
            }
        }
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : "+kalimat);
        System.out.println("Kalimat baru : "+hasil.trim());
    }
}

    

