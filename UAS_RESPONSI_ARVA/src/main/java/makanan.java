/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class makanan extends produk
{
    private String tanggalexp;
    
    public makanan (String namaProduk, int harga, String tanggalexp){
        super(namaProduk, harga);
        this.tanggalexp = tanggalexp;
    }
    
    @Override
    public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Garansi: " + tanggalexp + " tahun");}
}   
