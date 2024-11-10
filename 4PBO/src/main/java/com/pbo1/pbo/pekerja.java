/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo1.pbo;

/**
 *
 * @author Stanislaus
 */
public class pekerja extends manusia {
    private int gaji;
    
    public void pekerja(String nama, int usia, String pekerjaan, int gaji){
        this.nama= nama;
        this.usia= usia;
        this.pekerjaan= pekerjaan;
        this.gaji = gaji;
        
    }
    
    public int getGaji(){
        return this.gaji;
    }
    
    @Override
    
    public String toString(){
        return "nama " + this.nama + "usia"+ this.usia + "pekerjaan" + this.pekerjaan + "gaji"+this.gaji;
    }
}
