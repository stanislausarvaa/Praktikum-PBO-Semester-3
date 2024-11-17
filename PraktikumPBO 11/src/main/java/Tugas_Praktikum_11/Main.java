/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum_11;

/**
 *
 * @author 
 */ 
public class Main {  
    public static void main(String[] args) {  
        
        Pengarang pengarang1 = new Pengarang(" Rina Widaya ");  
        Pengarang pengarang2 = new Pengarang(" Albert Enstien");  

        Buku buku1 = new Buku("Jalan Jalan Ke Ujung Kota", pengarang1);  
        Buku buku2 = new Buku("Fisika  Quantum", pengarang2);  

        Perpustakaan perpustakaan = new Perpustakaan();  

        perpustakaan.tambahBuku(buku1);  
        perpustakaan.tambahBuku(buku2);  
        perpustakaan.infoPerpustakaan();  
    }  
}