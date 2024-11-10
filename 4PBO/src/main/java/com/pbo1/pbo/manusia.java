/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo1.pbo;

/**
 *
 * @author Stanislaus
 */
public class manusia {
    protected String nama;
    protected int usia;
    public String pekerjaan;
    
    public void manusia(String nama, int usia, String pekerjaan){
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
}
