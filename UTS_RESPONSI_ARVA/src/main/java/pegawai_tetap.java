/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class pegawai_tetap extends pegawai{
    private int tunjangan;
    
    public pegawai_tetap(String namaPegawai, int gaji, int tunjangan) {
    super(namaPegawai, gaji);
    this.tunjangan = tunjangan;}
    
    
    @Override
    public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Tunjangan : " + tunjangan); }
   
}
