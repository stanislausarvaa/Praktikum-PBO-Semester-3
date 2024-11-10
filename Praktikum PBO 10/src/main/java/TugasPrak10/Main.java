/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak10;

/**
 *
 * @author  
 */
public class Main {
    public static void main(String[] args) {
        // Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 100000; 
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik));
        
        // Objek Makanan
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 400000; 
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan));
    }
}
