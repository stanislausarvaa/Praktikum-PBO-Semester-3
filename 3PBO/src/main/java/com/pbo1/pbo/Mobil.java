/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo1.pbo;

/**
 *
 * @author Stanislaus Arva
 */
public class Mobil {
    
    private String merk;
    private String model;
    private String warna;
    private int tahun;
    
//    public Mobil(String merk, String model, int tahun){
//        this.merk = merk;
//        this.model = model;
//        this.tahun = tahun;
//    }
    
    void info(){
        System.out.println("---IDENTITAS Mobil---");
        System.out.println("Nama merk mobil ini adalah " + merk + ", Tahun mobil " + tahun + " Tahun" + " Model mobil ini" + model);
    }
    
    void stater(){
        System.out.println("Mobil ini menyala");
    }
    
    void control() {
    if (warna == null) {
        System.out.println("Warna mobil belum ditentukan.");} 
    else {
        System.out.println("Mobil ini berwarna " + warna);}
    }
    
//    Methode Setter
    public void setwarna(String warna){
        this.warna = warna;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    
    public void setmodel(String model){
        this.model = model;
    }
    
    public void settahun(int tahun){
        this.tahun = tahun;
    }
    
    
//    Methode Getter 
    public String getmerk(){
        return this.merk;
    }
    
    public String getmodel(){
        return this.model;
    }
    
    public int gettahun(){
        return this.tahun;
    }
    
    
    
    
    
}
