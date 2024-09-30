/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class elektronik extends produk{
    
    private int garansi; // garansi dalam tahun\
    
    public elektronik(String namaProduk, int harga, int garansi) {
    super(namaProduk, harga);
    this.garansi = garansi;}
    
    
    
    @Override
    public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Garansi: " + garansi + " tahun");}

}
