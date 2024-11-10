/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPraktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Kucing lala = new Kucing();
        lala.nama = "raymond";
        lala.jenis = "pucang";
        lala.suara = "Miw";
        lala.ciri = "Aktif";
        System.out.println("Info Kucing");
        lala.InfoHewan();
        
        Anjing lili = new Anjing();
        lili.nama = "bagus";
        lili.jenis = "yang galak";
        lili.suara = "Guk-guk";
        lili.ciri = "Aktif";
        System.out.println("\nInfo Anjing");
        lili.InfoHewan();
    }
}
