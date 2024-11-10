/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPraktikum5;

/**
 *
 * @author ASUS
 */
public class Mamalia extends Hewan {
    String ciri;
   
    @Override
    public void InfoHewan() {
        super.InfoHewan();
        System.out.println("Ciri hewan: " + ciri);
    }
}