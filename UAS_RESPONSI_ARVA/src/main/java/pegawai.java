/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class pegawai {
    private String namaPegawai;
    private int gaji;
    
    public pegawai(String namaPegawai, int gaji) {
    this.namaPegawai = namaPegawai;
    this.gaji = gaji; }
    
    public String getNamaPegawai() {
    return namaPegawai;}
    
    public void setNamaPegawai(String namaPegawai) {
    this.namaPegawai = namaPegawai;}
    
    public double getGaji() {
    return gaji; }
    
    public void setGaji(int gaji) {
    this.gaji = gaji; }
    
    public void tampilkanInfo() {
    System.out.println("Nama Pegawai: " + namaPegawai);
    System.out.println("Jumlah Gaji : " + gaji);}
}