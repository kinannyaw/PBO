/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guidatamahasiswa;

/**
 *
 * @author Devi Desvitha
 */
import java.sql.Connection;
public class GUIDATAMAHASISWA {

public static void main(String[] args) {

    Connection conn = KoneksiDatabase.getConnection();

    if (conn != null) {
        System.out.println("Database siap digunakan!");
    }

    FormUtama form = new FormUtama();
    form.setTitle("Form Data Mahasiswa");
    form.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    form.pack();
    form.setLocationRelativeTo(null);
    form.setVisible(true);
}
}
