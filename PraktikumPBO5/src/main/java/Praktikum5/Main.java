/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        System.out.println("-------------------");
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();                
    }
}
