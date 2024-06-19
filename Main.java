package TPDPBO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("------------------------------");
            System.out.println("Pilih Menu Data Pengguna :");
            System.out.println("1. Tampilkan Data Pengguna");
            System.out.println("2. Masukkan Data Pengguna");
            System.out.println("3. Edit Data Pengguna");
            System.out.println("4. Hapus Data Pengguna");
            System.out.println("5. Keluar");
            System.out.println("------------------------------\n");

            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    Db.show();
                    break;
                case 2:
                    System.out.println("Masukkan ID Pengguna:");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Masukkan Nama Pengguna:");
                    String nama = input.nextLine();
                    System.out.println("Masukkan Email Pengguna:");
                    String email = input.nextLine();
                    Db.insert(id, nama, email);
                    break;
                case 3:
                    System.out.println("Masukkan ID Pengguna:");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.println("Masukkan Nama Pengguna Baru:");
                    String enama = input.nextLine();
                    System.out.println("Masukkan Email Pengguna Baru:");
                    String eemail = input.nextLine();
                    Db.edit(id, enama, eemail);
                    break;
                case 4:
                    System.out.println("Masukkan ID Pengguna:");
                    id = input.nextInt();
                    Db.delete(id);
                    break;
                case 5:
                    System.out.println("Keluar Program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilih != 5);
        input.close();
    }
}
