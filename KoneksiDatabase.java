package com.mycompany.guidatamahasiswa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Devi Desvitha
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase {

    private static final String URL =
        "jdbc:mysql://localhost:3306/db_mahasiswa";

    private static final String USER = "root";

    private static final String PASSWORD = "DESSI25";

    public static Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                URL, USER, PASSWORD
            );

            System.out.println("Koneksi database berhasil!");

        } catch (SQLException e) {
            System.out.println(
                "Koneksi database gagal: " + e.getMessage()
            );
        }

        return conn;
    }
}
