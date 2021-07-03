/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinavproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Baglanma {
    
    public static Statement Baglan() {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_sinavlar", "sa", "as");
            Statement stmt = con.createStatement();
            return stmt;
        } catch (Exception e) {
            System.out.println("Bağlantı Hatası!    " + e);
            return null;
        }
    }
    public void SoruEkle(String soru, String cevap1, String cevap2, String cevap3, String cevap4, int dogru) {
        Scanner scan = new Scanner(System.in, "iso-8859-9");
        try {
            ArrayList dizi = new ArrayList();
            String sorgu1 = String.format("select * from TBL_SORU");
            ResultSet ekleme1 = Baglan().executeQuery(sorgu1);
            while (ekleme1.next()) {
                dizi.add(ekleme1.getString("ID"));
            }
            int deger = dizi.size();
            String sorgu = String.format("insert into TBL_SORU values( %d, '%s', '%s','%s','%s','%s',%d)", (deger + 1), soru, cevap1, cevap2, cevap3, cevap4, dogru);
            int ekleme = Baglan().executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println("Kayıt Eklemede sorun oluştu.    " + e);
        }
    }

}
