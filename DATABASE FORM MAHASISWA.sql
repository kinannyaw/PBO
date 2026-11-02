
CREATE DATABASE db_mahasiswa;

USE db_mahasiswa;

CREATE TABLE mahasiswa (
    mahasiswa INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    nim VARCHAR(20) NOT NULL UNIQUE,
    program_studi VARCHAR(100) NOT NULL,
    jurusan VARCHAR(100) NOT NULL,
    universitas VARCHAR(100) NOT NULL,
    angkatan INT NOT NULL,
    ipk DECIMAL(3,2) NOT NULL,
    kategori ENUM('Reguler', 'Beasiswa') NOT NULL,
    jenis_beasiswa VARCHAR(100),
    nominal_beasiswa DECIMAL(15,2),
    nominal_ukt VARCHAR(50) NOT NULL,
    tanggal_input TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
