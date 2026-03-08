/* Nama File   : MMahasiswa.java
 * Deskripsi   : Berisi program utama class MMahasiswa
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 04 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // DEPENDENCY : Class MMahasiswa bergantung pada class lain karena membuat objek
        // dan menggunakan method dari class Dosen, Mahasiswa, Kendaraan, dan MataKuliah.
        
        // membuat objek dosen wali
        Dosen d1 = new Dosen("196902141994032001", "Dr. Budi Santoso", "Informatika"); 
        Dosen d2 = new Dosen("197805102000031001", "Dr. Siti Rahmawati", "Informatika"); 

        // membuat objek kendaraan
        Kendaraan k1 = new Kendaraan("H4321CD", "Motor"); 
        Kendaraan k2 = new Kendaraan("H8765EF", "Mobil"); 

        // membuat objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("24060124130081", "Hana Nafi'atul Haq", "Informatika"); 
        Mahasiswa m2 = new Mahasiswa("24060124130123", "Rina Putri", "Informatika"); 

        // membuat objek mata kuliah
        MataKuliah mk1 = new MataKuliah("MIK1624401", "Jaringan Komputer", 3); 
        MataKuliah mk2 = new MataKuliah("MIK1624402", "Pemrograman Berorientasi Objek", 3); 
        MataKuliah mk3 = new MataKuliah("MIK1624403", "Manajemen Basis Data", 3);
        MataKuliah mk4 = new MataKuliah("MIK1624404", "Analisis dan Strategi Algoritma", 3); 
        MataKuliah mk5 = new MataKuliah("MIK1624405", "Kecerdasan Buatan", 3); 
        MataKuliah mk6 = new MataKuliah("MIK1624406", "Grafik dan Teknik Interaktif", 3); 
        MataKuliah mk7 = new MataKuliah("MIK1624601", "Keamanan dan Jaminan Informasi", 3); 
        MataKuliah mk8 = new MataKuliah("MIK1624603", "Interaksi Manusia Komputer", 3); 

        // ASOSIASI : Hubungan antara dua kelas hanya menggunakan ( Mahasiswa berhubungan dengan Dosen (dosen wali))
        // KOMPOSISI : Hubungan kepemilikan kuat (mahasiswa dapat memiliki kendaraan dan dimiliki eksklusif oleh satu mahasiswa
        // Jika objek Mahasiswa dihapus maka hubungan kepemilikan kendaraan juga hilang.)
        
        // mengeset dosen wali dan kendaraan mahasiswa pertama
        m1.setDosenWali(d1); 
        m1.setKendaraan(k1); 

        // AGREGASI : Hubungan kepemilikan lemah (Mahasiswa mengambil MataKuliah, tetapi MataKuliah tetap ada walaupun Mahasiswa dihapus
        // dan MataKuliah yang sama dapat diambil oleh banyak mahasiswa.)
        
        // menambahkan matkul mahasiswa pertama
        m1.addMatKul(mk1); 
        m1.addMatKul(mk2); 
        m1.addMatKul(mk3); 
        m1.addMatKul(mk4); 
        m1.addMatKul(mk5); 
        m1.addMatKul(mk6); 
        m1.addMatKul(mk8);  

        // mengeset dosen wali dan kendaraan mahasiswa kedua
        m2.setDosenWali(d2);
        m2.setKendaraan(k2); 

        // menambahkan matkul mahasiswa kedua
        m2.addMatKul(mk1); 
        m2.addMatKul(mk2); 
        m2.addMatKul(mk3); 
        m2.addMatKul(mk7); 
        m2.addMatKul(mk8); 

        m1.printDetailMhs(); // menampilkan detail mahasiswa pertama
        System.out.println("\n=================================="); // batasan mahasiswa pertama dan kedua
        m2.printDetailMhs(); // menampilkan detail mahasiswa kedua
    }
}