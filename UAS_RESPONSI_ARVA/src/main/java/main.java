/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class main {
     public static void main(String[] args) {
         
    // Polimorfisme dengan Produk
    produk produk1 = new elektronik("Laptop", 15000000, 2);
    produk produk2 = new makanan("Tahu Bulat", 2000, "2225");
    
    // Polimorfisme dengan Pegawai
    pegawai pegawai1 = new pegawai_tetap("Nimrap", 5000000, 1000000);
    pegawai pegawai2 = new pegawai_kontrak("Azer", 3000000, 12);
    // Menampilkan informasi produk
    System.out.println("Output Produk:");
    produk1.tampilkanInfo();
    System.out.println();
    produk2.tampilkanInfo();
    System.out.println();
    // Menampilkan informasi pegawai
    System.out.println("Output Pegawai:");
    pegawai1.tampilkanInfo();
    System.out.println();
    pegawai2.tampilkanInfo();
 }

}
