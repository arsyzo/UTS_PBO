/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.Controler;

/**
 *
 * @author Marsy
 */
import Hotel.Model.HotelReservation;
public class Kamar implements Reservasi {
    public void buatReservasi(String namaPengunjung, String tipeKamar, String tanggalPemesanan, int jumlahKamar, int lamaMenginap) {
        HotelReservation reservasi = new HotelReservation(namaPengunjung, tipeKamar, tanggalPemesanan, jumlahKamar, lamaMenginap);
        reservasi.tampilkanReservasi();
    }

    private int kamarEkonomiTersedia = 20;
    private int kamarVIPTersedia = 15;
    private int kamarVVIPTersedia = 7;

    // Method untuk mengecek ketersediaan kamar
    public boolean cekKetersediaanKamar(String tipeKamar, int jumlahPesan) {
        switch (tipeKamar.toLowerCase()) {
            case "ekonomi":
                if (kamarEkonomiTersedia >= jumlahPesan) {
                    kamarEkonomiTersedia -= jumlahPesan;
                    return true;
                } else {
                    System.out.println("Kamar Ekonomi sudah penuh.");
                    System.out.println("tidak tersedia");
                    return false;
                }
            case "vip":
                if (kamarVIPTersedia >= jumlahPesan) {
                    kamarVIPTersedia -= jumlahPesan;
                    return true;
                } else {
                    System.out.println("Kamar VIP sudah penuh.");
                    System.out.println("tidak tersedia");
                    return false;
                }
            case "vvip":
                if (kamarVVIPTersedia >= jumlahPesan) {
                    kamarVVIPTersedia -= jumlahPesan;
                    return true;
                } else {
                    System.out.println("Kamar VVIP sudah penuh.");
                    System.out.println("tidak tersedia");
                    return false;
                }
            default:
                System.out.println("Tipe kamar tidak valid.");
                return false;
        }
    }

    // Method untuk melakukan reservasi
    public void Reservasi(String nama, String tipeKamar, String tanggal, int jumlahKamar, int lamaMenginap) {
        if (cekKetersediaanKamar(tipeKamar, jumlahKamar)) {
            System.out.println("Reservasi berhasil untuk " + nama);
            System.out.println("Tipe Kamar: " + tipeKamar);
            System.out.println("Tanggal Check-in: " + tanggal);
            System.out.println("Jumlah Kamar: " + jumlahKamar);
            System.out.println("Lama Menginap: " + lamaMenginap + " hari");
        } else {
            System.out.println("Gagal melakukan reservasi.");
        }
    }

    // Method untuk melihat ketersediaan kamar
    public void lihatKetersediaanKamar() {
        System.out.println("Ketersediaan kamar:");
        System.out.println("Ekonomi: " + kamarEkonomiTersedia + " kamar");
        System.out.println("VIP: " + kamarVIPTersedia + " kamar");
        System.out.println("VVIP: " + kamarVVIPTersedia + " kamar");
    }
}


