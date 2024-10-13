/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel.Controler;

/**
 *
 * @author Marsy
 */
import Hotel.Model.HotelReservation;
public interface Reservasi {
    void buatReservasi(String namaPengunjung, String tipeKamar, String tanggalPemesanan, int jumlahKamar, int lamaMenginap);
}
