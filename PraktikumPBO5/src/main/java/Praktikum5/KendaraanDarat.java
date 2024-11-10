/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;

/**
 *
 * @author ASUS
 */
public class KendaraanDarat extends Kendaraan {
    int jumlahRoda;
    
    public KendaraanDarat(String nama, int jumlahRoda) {
      
        this.jumlahRoda = jumlahRoda;
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("Kendaraan darat berjalan di jalan");
    }
}
