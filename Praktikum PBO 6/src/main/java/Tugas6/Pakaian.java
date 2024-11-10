/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author 
 */
// Kelas Pakaian  
public class Pakaian extends Produk {  
    private final double diskon = 0.1;  

    public Pakaian(String nama, double harga) {  
        super(nama, harga);  
    }  

    @Override  
    public double hitungDiskon() {  
        return harga - (harga * diskon);  
    }  

    public double getDiskonPersen() {  
        return diskon * 100; // Mengembalikan diskon dalam persen  
    }  
}  
