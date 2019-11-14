/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_febbytriana_xiirplb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LABKOM1-RPL16
 */
public class Koneksi_Febby {
    private Connection koneksiDB;
    private String password="";
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Gagal Koneksi" +ex);
        }
        String url = "jdbc:mysql://localhost:3306/db_febby";
        try{
            koneksiDB = DriverManager.getConnection(url, "root","");
            System.out.println("Berhasil Koneksi Database");
        }
        catch(SQLException ex){
            System.out.println("Gagal Koneksi Database");
        }
        return koneksiDB;
    }
}
