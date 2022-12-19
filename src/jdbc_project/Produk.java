/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc_project;

/**
 *
 * @author ASUS
 */
public class Produk {
    private String nama_produk;
    private double harga;
    private int jumlah;
    private double diskon;

    public Produk(String nama_produk, double harga, int jumlah, double diskon) {
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }
    public double hargaDiskon(){
        return harga - (harga * diskon);
    }
}
