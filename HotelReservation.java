/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.Model;

/**
 *
 * @author Marsy
 */
public class HotelReservation {
    private String namaPengunjung;
    private String tipeKamar;
    private String tanggalPemesanan;
    private int jumlahKamar;
    private int lamaMenginap;

    public HotelReservation(String namaPengunjung, String tipeKamar, String tanggalPemesanan, int jumlahKamar, int lamaMenginap) {
        this.namaPengunjung = namaPengunjung;
        this.tipeKamar = tipeKamar;
        this.tanggalPemesanan = tanggalPemesanan;
        this.jumlahKamar = jumlahKamar;
        this.lamaMenginap = lamaMenginap;
    }

    public void tampilkanReservasi() {
        System.out.println("Nama Pengunjung: " + this.namaPengunjung);
        System.out.println("Tipe Kamar: " + this.tipeKamar);
        System.out.println("Tanggal Pemesanan: " + this.tanggalPemesanan);
        System.out.println("Jumlah Kamar: " + this.jumlahKamar);
        System.out.println("Lama Menginap: " + this.lamaMenginap + " hari");
    }
}
