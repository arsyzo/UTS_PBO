/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotel.View;

/**
 *
 * @author Marsy
 */
import Hotel.Controler.Kamar;
import java.util.Scanner;


public class MainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Kamar kamar = new Kamar();

        while (true) {
            System.out.println("=== Sistem Reservasi Hotel ===");
            System.out.println("1. Memesan kamar");
            System.out.println("2. Melihat ketersediaan kamar");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    input.nextLine(); // clear buffer
                    System.out.println("-------------------------------------");
                    System.out.println("Masukkan Nama Pengunjung: ");
                    String nama = input.nextLine();

                    System.out.println("Pilih Tipe Kamar (1. Ekonomi, 2. VIP, 3. VVIP): ");
                    int pilihanKamar = input.nextInt();
                    String tipeKamar = "";

                    switch (pilihanKamar) {
                        case 1:
                            tipeKamar = "Ekonomi";
                            break;
                        case 2:
                            tipeKamar = "VIP";
                            break;
                        case 3:
                            tipeKamar = "VVIP";
                            break;
                        default:
                            System.out.println("Pilihan kamar tidak valid.");
                            continue;
                    }

                    input.nextLine(); // clear buffer
                    System.out.println("Masukkan Tanggal Pemesanan (2024-02-12): ");
                    String tanggal = input.nextLine();

                    System.out.println("Masukkan Lama Menginap (hari): ");
                    int lama = input.nextInt();

                    System.out.println("Masukkan Jumlah Kamar yang akan dipesan: ");
                    int jumlah = input.nextInt();

                    kamar.buatReservasi(nama, tipeKamar, tanggal, jumlah, lama);
                    break;

                    
                case 2:
                    System.out.println("-------------------------------------");
                    kamar.lihatKetersediaanKamar();
                    break;

                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("Terima kasih!");
                    System.out.println("Silahkan datang kembali");
                    return;


                default:
                    System.out.println("-------------------------------------");
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
