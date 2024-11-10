/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo1.pbo;

/**
 *
 * @author Stanislaus Arva
 */

public class hewan {
    private String nama;
    private int umur;
    
    public hewan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    void suara(){
        System.out.println("Hewan Bersuara");
    }
    
    void info(){
        System.out.println("---IDENTITAS HEWAN---");
        System.out.println("Nama Hewan ini adalah " + nama + ", Umur Hewan " + umur + " Tahun");
        
    }
}
