/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinavproject;

import java.sql.Statement;
import java.lang.Object;
import java.lang.String;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    Baglanma b = new Baglanma();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Soru = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_cevap1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_cevap2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_cevap3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_cevap4 = new javax.swing.JTextArea();
        btn_Ekle = new javax.swing.JButton();
        cmb_Dogru = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_Ara = new javax.swing.JTextField();
        btn_Ara = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        table_Soru = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        btn_basla = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablo_soru = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        radioBirA = new javax.swing.JRadioButton();
        radioBirB = new javax.swing.JRadioButton();
        radioBirC = new javax.swing.JRadioButton();
        radioBirD = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        radioIkiA = new javax.swing.JRadioButton();
        radioIkiB = new javax.swing.JRadioButton();
        radioIkiC = new javax.swing.JRadioButton();
        radioIkiD = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        radioBesA = new javax.swing.JRadioButton();
        radioBesB = new javax.swing.JRadioButton();
        radioBesC = new javax.swing.JRadioButton();
        radioBesD = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        radioUcA = new javax.swing.JRadioButton();
        radioUcB = new javax.swing.JRadioButton();
        radioUcC = new javax.swing.JRadioButton();
        radioUcD = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        radioDortA = new javax.swing.JRadioButton();
        radioDortB = new javax.swing.JRadioButton();
        radioDortC = new javax.swing.JRadioButton();
        radioDortD = new javax.swing.JRadioButton();
        btnBitir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSonuc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Soru;");

        txt_Soru.setColumns(20);
        txt_Soru.setRows(5);
        jScrollPane1.setViewportView(txt_Soru);

        jLabel2.setText("A Şıkkı;");

        txt_cevap1.setColumns(20);
        txt_cevap1.setRows(5);
        jScrollPane2.setViewportView(txt_cevap1);

        jLabel3.setText("B Şıkkı;");

        txt_cevap2.setColumns(20);
        txt_cevap2.setRows(5);
        jScrollPane3.setViewportView(txt_cevap2);

        jLabel4.setText("C Şıkkı;");

        txt_cevap3.setColumns(20);
        txt_cevap3.setRows(5);
        jScrollPane4.setViewportView(txt_cevap3);

        jLabel5.setText("D Şıkkı;");

        txt_cevap4.setColumns(20);
        txt_cevap4.setRows(5);
        jScrollPane5.setViewportView(txt_cevap4);

        btn_Ekle.setText("Ekle");
        btn_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EkleActionPerformed(evt);
            }
        });

        cmb_Dogru.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));

        jLabel6.setText("Doğru Cevap;");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_Dogru, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Dogru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel1);

        jTabbedPane2.addTab("Soru Ekleme", jScrollPane6);

        jLabel12.setText("Aratacağınız Kelime;");

        btn_Ara.setText("Ara");
        btn_Ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AraActionPerformed(evt);
            }
        });

        table_Soru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(table_Soru);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Ara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Ara, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_Ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Ara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jScrollPane12.setViewportView(jPanel2);

        jTabbedPane2.addTab("Soru Arama", jScrollPane12);

        btn_basla.setText("Başla");
        btn_basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baslaActionPerformed(evt);
            }
        });

        tablo_soru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tablo_soru);

        radioBirA.setText("A");
        radioBirA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBirAMouseClicked(evt);
            }
        });

        radioBirB.setText("B");
        radioBirB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBirBMouseClicked(evt);
            }
        });

        radioBirC.setText("C");
        radioBirC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBirCMouseClicked(evt);
            }
        });

        radioBirD.setText("D");
        radioBirD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBirDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioBirA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBirB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBirC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBirD)
                .addGap(8, 8, 8))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBirA)
                    .addComponent(radioBirB)
                    .addComponent(radioBirC)
                    .addComponent(radioBirD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        radioIkiA.setText("A");
        radioIkiA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioIkiAMouseClicked(evt);
            }
        });

        radioIkiB.setText("B");
        radioIkiB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioIkiBMouseClicked(evt);
            }
        });

        radioIkiC.setText("C");
        radioIkiC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioIkiCMouseClicked(evt);
            }
        });

        radioIkiD.setText("D");
        radioIkiD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioIkiDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioIkiA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioIkiB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioIkiC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioIkiD)
                .addGap(8, 8, 8))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioIkiA)
                    .addComponent(radioIkiB)
                    .addComponent(radioIkiC)
                    .addComponent(radioIkiD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        radioBesA.setText("A");
        radioBesA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBesAMouseClicked(evt);
            }
        });

        radioBesB.setText("B");
        radioBesB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBesBMouseClicked(evt);
            }
        });

        radioBesC.setText("C");
        radioBesC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBesCMouseClicked(evt);
            }
        });

        radioBesD.setText("D");
        radioBesD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBesDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioBesA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBesB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBesC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBesD)
                .addGap(8, 8, 8))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBesA)
                    .addComponent(radioBesB)
                    .addComponent(radioBesC)
                    .addComponent(radioBesD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        radioUcA.setText("A");
        radioUcA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioUcAMouseClicked(evt);
            }
        });

        radioUcB.setText("B");
        radioUcB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioUcBMouseClicked(evt);
            }
        });

        radioUcC.setText("C");
        radioUcC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioUcCMouseClicked(evt);
            }
        });

        radioUcD.setText("D");
        radioUcD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioUcDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioUcA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioUcB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioUcC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioUcD)
                .addGap(8, 8, 8))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioUcA)
                    .addComponent(radioUcB)
                    .addComponent(radioUcC)
                    .addComponent(radioUcD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        radioDortA.setText("A");
        radioDortA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDortAMouseClicked(evt);
            }
        });

        radioDortB.setText("B");
        radioDortB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDortBMouseClicked(evt);
            }
        });

        radioDortC.setText("C");
        radioDortC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDortCMouseClicked(evt);
            }
        });

        radioDortD.setText("D");
        radioDortD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDortDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioDortA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioDortB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioDortC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioDortD)
                .addGap(8, 8, 8))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDortA)
                    .addComponent(radioDortB)
                    .addComponent(radioDortC)
                    .addComponent(radioDortD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBitir.setText("Sınavı Bitir");
        btnBitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitirActionPerformed(evt);
            }
        });

        jLabel7.setText("Soru 1:");

        jLabel8.setText("Soru 2:");

        jLabel9.setText("Soru 3:");

        jLabel10.setText("Soru 4:");

        jLabel11.setText("Soru 5:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnBitir, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(btn_basla)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(txtSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_basla)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBitir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(670, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel3);

        jTabbedPane2.addTab("Sınava Başla", jScrollPane7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JPanel contentPane;
    private JTable table;
    DefaultTableModel modelim = new DefaultTableModel();
    Object[] kolonlar = {"SORU", "CEVAP1", "CEVAP2", "CEVAP3", "CEVAP4"};
    Object[] satirlar = new Object[5];
    int soru1 = 0;
    int soru2 = 0;
    int soru3 = 0;
    int soru4 = 0;
    int soru5 = 0;
    private void btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EkleActionPerformed
        String soru = txt_Soru.getText();
        String cevap1 = txt_cevap1.getText();
        String cevap2 = txt_cevap2.getText();
        String cevap3 = txt_cevap3.getText();
        String cevap4 = txt_cevap4.getText();
        int dogru = cmb_Dogru.getSelectedIndex();
        b.SoruEkle(soru, cevap1, cevap2, cevap3, cevap4, (dogru + 1));
        txt_Soru.setText("");
        txt_cevap1.setText("");
        txt_cevap2.setText("");
        txt_cevap3.setText("");
        txt_cevap4.setText("");
    }//GEN-LAST:event_btn_EkleActionPerformed

    private void btn_AraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AraActionPerformed
        String gelen = txt_Ara.getText();
        try {
            modelim.setRowCount(0);
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_sinavlar", "sa", "as");
            String query = "select * from TBL_SORU where soru LIKE ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "%" + gelen + "%");

            ResultSet rs = ps.executeQuery();
            table_Soru.setModel(modelim);
            modelim.setColumnIdentifiers(kolonlar);
            while (rs.next()) {
                satirlar[0] = rs.getString("SORU");
                satirlar[1] = rs.getString("CEVAP1");
                satirlar[2] = rs.getString("CEVAP2");
                satirlar[3] = rs.getString("CEVAP3");
                satirlar[4] = rs.getString("CEVAP4");
                modelim.addRow(satirlar);
            }
            System.out.println("Tablo Eklendi...");
        } catch (Exception e) {
            System.out.println("Tablo Eklemede Bir Hata Oluştu...   " + e);
        }

    }//GEN-LAST:event_btn_AraActionPerformed

    public static int indexOfIntArray(int[] array, int key) {
        int returnvalue = -1;
        for (int i = 0; i < array.length; ++i) {
            if (key == array[i]) {
                returnvalue = i;
                break;
            }
        }
        return returnvalue;
    }

    public void RadioGrupla() {
        ButtonGroup bgroup1 = new ButtonGroup();
        bgroup1.add(radioBirA);
        bgroup1.add(radioBirB);
        bgroup1.add(radioBirC);
        bgroup1.add(radioBirD);
        ButtonGroup bgroup2 = new ButtonGroup();
        bgroup2.add(radioIkiA);
        bgroup2.add(radioIkiB);
        bgroup2.add(radioIkiC);
        bgroup2.add(radioIkiD);
        ButtonGroup bgroup3 = new ButtonGroup();
        bgroup3.add(radioUcA);
        bgroup3.add(radioUcB);
        bgroup3.add(radioUcC);
        bgroup3.add(radioUcD);
        ButtonGroup bgroup4 = new ButtonGroup();
        bgroup4.add(radioDortA);
        bgroup4.add(radioDortB);
        bgroup4.add(radioDortC);
        bgroup4.add(radioDortD);
        ButtonGroup bgroup5 = new ButtonGroup();
        bgroup5.add(radioBesA);
        bgroup5.add(radioBesB);
        bgroup5.add(radioBesC);
        bgroup5.add(radioBesD);
    }
    int[] dizekopya = new int[5];
    private void btn_baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baslaActionPerformed
        try {
            btn_basla.setVisible(false);
            modelim.setRowCount(0);
            int[] dize = new int[5];
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_sinavlar", "sa", "as");
            Statement stmt = con.createStatement();
            ArrayList dizi = new ArrayList();
            String sorgu1 = String.format("select * from TBL_SORU");
            ResultSet ekleme1 = stmt.executeQuery(sorgu1);
            while (ekleme1.next()) {
                dizi.add(ekleme1.getString("ID"));
            }
            int deger = dizi.size();

            Random rnd = new Random();

            PreparedStatement ps;
            int sayi;
            int x = 0;
            while (x < 5) {
                sayi = rnd.nextInt(deger);
                int yoksa = indexOfIntArray(dize, sayi);
                if (yoksa == -1) {
                    dize[x] = sayi;
                    x++;
                }
            }
            for (int i = 0; i < 5; i++) {
                String query = "select * from TBL_SORU where id=" + dize[i];
                ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                tablo_soru.setModel(modelim);
                modelim.setColumnIdentifiers(kolonlar);
                while (rs.next()) {
                    satirlar[0] = rs.getString("SORU");
                    satirlar[1] = rs.getString("CEVAP1");
                    satirlar[2] = rs.getString("CEVAP2");
                    satirlar[3] = rs.getString("CEVAP3");
                    satirlar[4] = rs.getString("CEVAP4");
                    modelim.addRow(satirlar);
                }
                System.out.println("Tablo Eklendi...");
                for (int j = 0; j < 5; j++) {
                    dizekopya[j] = dize[j];
                }
            }
            RadioGrupla();

        } catch (Exception e) {
            System.out.println("Tablo Eklemede Bir Hata Oluştu...   " + e);
        }
    }//GEN-LAST:event_btn_baslaActionPerformed

    private void btnBitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitirActionPerformed
        try {
            btnBitir.setVisible(false);
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_sinavlar", "sa", "as");
            Statement stmt = con.createStatement();
            int[] cevap = new int[5];
            for (int i = 0; i < 5; i++) {
                String query1 = "select * from TBL_SORU where id=" + dizekopya[i];
                PreparedStatement sp = con.prepareStatement(query1);
                ResultSet rs = sp.executeQuery();
                while (rs.next()) {
                    cevap[i] = rs.getInt("DOGRU");
                }
            }
            int dogruSayisi=0;
            int[] cevaplar=new int[5];
            cevaplar[0]=soru1;
            cevaplar[1]=soru2;
            cevaplar[2]=soru3;
            cevaplar[3]=soru4;
            cevaplar[4]=soru5;
            for (int i = 0; i < 5; i++) {
                if (cevap[i]==cevaplar[i]) {
                    dogruSayisi++;
                }
            }
            txtSonuc.setText("Doğru Sayısı; " + dogruSayisi+" Yanlış Sayısı; "+(5-dogruSayisi));
            System.out.println("Doğruların" + dogruSayisi);
        } catch (Exception ex) {
            System.out.println("Sınav Bitirmede Hata oluştu" + ex);
        }
    }//GEN-LAST:event_btnBitirActionPerformed

    private void radioBirAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBirAMouseClicked
        soru1 = 1;
    }//GEN-LAST:event_radioBirAMouseClicked

    private void radioBirBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBirBMouseClicked
        soru1=2;
    }//GEN-LAST:event_radioBirBMouseClicked

    private void radioBirCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBirCMouseClicked
        soru1=3;
    }//GEN-LAST:event_radioBirCMouseClicked

    private void radioBirDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBirDMouseClicked
        soru1=4;
    }//GEN-LAST:event_radioBirDMouseClicked

    private void radioIkiAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioIkiAMouseClicked
        soru2=1;
    }//GEN-LAST:event_radioIkiAMouseClicked

    private void radioIkiBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioIkiBMouseClicked
        soru2=2;
    }//GEN-LAST:event_radioIkiBMouseClicked

    private void radioIkiCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioIkiCMouseClicked
        soru2=3;
    }//GEN-LAST:event_radioIkiCMouseClicked

    private void radioIkiDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioIkiDMouseClicked
        soru2=4;
    }//GEN-LAST:event_radioIkiDMouseClicked

    private void radioUcAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioUcAMouseClicked
        soru3=1;
    }//GEN-LAST:event_radioUcAMouseClicked

    private void radioUcBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioUcBMouseClicked
        soru3=2;
    }//GEN-LAST:event_radioUcBMouseClicked

    private void radioUcCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioUcCMouseClicked
        soru3=3;
    }//GEN-LAST:event_radioUcCMouseClicked

    private void radioUcDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioUcDMouseClicked
        soru3=4;
    }//GEN-LAST:event_radioUcDMouseClicked

    private void radioDortAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDortAMouseClicked
        soru4=1;
    }//GEN-LAST:event_radioDortAMouseClicked

    private void radioDortBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDortBMouseClicked
        soru4=2;
    }//GEN-LAST:event_radioDortBMouseClicked

    private void radioDortCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDortCMouseClicked
        soru4=3;
    }//GEN-LAST:event_radioDortCMouseClicked

    private void radioDortDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDortDMouseClicked
        soru4=4;
    }//GEN-LAST:event_radioDortDMouseClicked

    private void radioBesAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBesAMouseClicked
        soru5=1;
    }//GEN-LAST:event_radioBesAMouseClicked

    private void radioBesBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBesBMouseClicked
        soru5=2;
    }//GEN-LAST:event_radioBesBMouseClicked

    private void radioBesCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBesCMouseClicked
        soru5=3;
    }//GEN-LAST:event_radioBesCMouseClicked

    private void radioBesDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBesDMouseClicked
        soru5=4;
    }//GEN-LAST:event_radioBesDMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBitir;
    private javax.swing.JButton btn_Ara;
    private javax.swing.JButton btn_Ekle;
    private javax.swing.JButton btn_basla;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cmb_Dogru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton radioBesA;
    private javax.swing.JRadioButton radioBesB;
    private javax.swing.JRadioButton radioBesC;
    private javax.swing.JRadioButton radioBesD;
    private javax.swing.JRadioButton radioBirA;
    private javax.swing.JRadioButton radioBirB;
    private javax.swing.JRadioButton radioBirC;
    private javax.swing.JRadioButton radioBirD;
    private javax.swing.JRadioButton radioDortA;
    private javax.swing.JRadioButton radioDortB;
    private javax.swing.JRadioButton radioDortC;
    private javax.swing.JRadioButton radioDortD;
    private javax.swing.JRadioButton radioIkiA;
    private javax.swing.JRadioButton radioIkiB;
    private javax.swing.JRadioButton radioIkiC;
    private javax.swing.JRadioButton radioIkiD;
    private javax.swing.JRadioButton radioUcA;
    private javax.swing.JRadioButton radioUcB;
    private javax.swing.JRadioButton radioUcC;
    private javax.swing.JRadioButton radioUcD;
    private javax.swing.JTable table_Soru;
    private javax.swing.JTable tablo_soru;
    private javax.swing.JTextField txtSonuc;
    private javax.swing.JTextField txt_Ara;
    private javax.swing.JTextArea txt_Soru;
    private javax.swing.JTextArea txt_cevap1;
    private javax.swing.JTextArea txt_cevap2;
    private javax.swing.JTextArea txt_cevap3;
    private javax.swing.JTextArea txt_cevap4;
    // End of variables declaration//GEN-END:variables
}
