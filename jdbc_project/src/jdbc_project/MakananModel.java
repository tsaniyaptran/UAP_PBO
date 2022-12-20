/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc_project;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class MakananModel {
    private final Connection CONN;

    public MakananModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addMakanan(Makanan makanan) throws SQLException{
        String insertMakanan = "INSERT INTO makanan VALUES ('"
                 + makanan.getId_makanan() + "', '" + makanan.getDaya_tahan()
                 + "', '" + makanan.getNama_produk() + "', '" + makanan.getHarga()
                 + "', '" + makanan.getJumlah()+ "', '" + makanan.getDiskon()
                 + "');";
         
        try { 
            if (CONN.createStatement().executeUpdate(insertMakanan) > 0) {
                System.out.println("Berhasil Memasukkan Data");
            } else {
                System.out.println("Gagal Memasukan Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Memasukkan Data ");
        }
    }
    
    public void deleteMakanan(Makanan makanan){
        String delete = "DELETE FROM makanan WHERE id_makanan = '"
                 + makanan.getId_makanan() + "';"; 
        
        try { 
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil Menghapus Data");
            } else {
                System.out.println("Gagal Menghapus Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Menghapus Data ");
        }
    }
    
    
    
}
