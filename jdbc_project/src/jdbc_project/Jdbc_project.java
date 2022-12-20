/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc_project;

import db.DBHelper;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Jdbc_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        DBHelper.getConnection();
        BarangModel barang = new BarangModel ();
        Barang b1 = new Barang ("c12c2", "12", "makanan", "burger", 50000, 3, 10000);
        barang.addBarang(b1);
//        KategoriModel kategori = new KategoriModel ();
//        Kategori k1 = new Kategori("makanan");
//        kategori.addKategori(k1);
//        MakananModel makanan = new MakananModel(); 
//        Makanan m1 = new Makanan(1, 1, "Burger", 50000, 1, 10000); 
//        makanan.deleteMakanan(m1);
        
    }
    
    
    
}
