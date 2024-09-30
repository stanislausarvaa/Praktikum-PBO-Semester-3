/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class pegawai_kontrak extends pegawai{
 
    private int lamaKontrak; // lama kontrak dalam bulan
    
    public pegawai_kontrak(String namaPegawai, int gaji, int lamaKontrak) {
    super(namaPegawai, gaji);
    this.lamaKontrak = lamaKontrak;}
    
    @Override
    public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    } 
}
