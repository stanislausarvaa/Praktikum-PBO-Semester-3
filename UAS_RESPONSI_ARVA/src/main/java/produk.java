/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class produk {
     private String namaProduk;
     private int harga;
     
    public produk(String namaProduk, int harga) {
    this.namaProduk = namaProduk;
    this.harga = harga;
    }
    
    public String getNamaProduk() {
    return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
    this.namaProduk = namaProduk;
    }
    
    public double getHarga() {
    return harga;
    }
    
    public void setHarga(int harga) {
    this.harga = harga;
    }
    
    public void tampilkanInfo() {
    System.out.println("Nama Produk: " + namaProduk);
    System.out.println("Harga: " + harga);
    }
    
}
