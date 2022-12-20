/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc_project;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class BarangModel {
    private final Connection CONN;

    public BarangModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addBarang(Barang barang) throws SQLException{
        String insert = "INSERT INTO barang VALUES ('"
                 + barang.getBarcode()  + "', '" + barang.getExpired() + "', '"
                 + barang.getKategori()  + "', '" + barang.getNama_produk() + "', '"
                 + barang.getHarga()  + "', '" + barang.getJumlah() + "', '"
                 + barang.getDiskon()  + "');";
         
         
        try { 
            if (CONN.createStatement().executeUpdate(insert) > 0) {
                System.out.println("Berhasil Memasukkan Data");
            } else {
                System.out.println("Gagal Memasukan Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Memasukkan Data ");
        }
    }
    
    public void deleteBarang(Barang barang){
        String delete = "DELETE FROM kategori WHERE barcode = '"
                 + barang.getBarcode() + "';"; 
        
        try { 
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil Menghapus Data");
            } else {
                System.out.println("Gagal Menghapus Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Menghapus Data ");
        }
    }

}
