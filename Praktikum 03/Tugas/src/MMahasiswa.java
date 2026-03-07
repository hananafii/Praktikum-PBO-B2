public class MMahasiswa {
    public static void main(String[] args) {

        /*************** DOSEN ***************/
        Dosen d1 = new Dosen("196902141994032001", "Dr. Budi Santoso", "Informatika"); // membuat objek dosen wali pertama
        Dosen d2 = new Dosen("197805102000031001", "Dr. Siti Rahmawati", "Informatika"); // membuat objek dosen wali kedua

        /*************** KENDARAAN ***************/
        Kendaraan k1 = new Kendaraan("H4321CD", "Motor"); // membuat kendaraan mahasiswa pertama
        Kendaraan k2 = new Kendaraan("H8765EF", "Mobil"); // membuat kendaraan mahasiswa kedua

        /*************** MAHASISWA ***************/
        Mahasiswa m1 = new Mahasiswa("24060124130081", "Hana Nafi'atul Haq", "Informatika"); // membuat mahasiswa pertama
        Mahasiswa m2 = new Mahasiswa("24060124130123", "Rina Putri", "Informatika"); // membuat mahasiswa kedua

        /*************** MATAKULIAH ***************/
        MataKuliah mk1 = new MataKuliah("MIK1624401", "Jaringan Komputer", 3); // membuat objek mata kuliah JARKOM
        MataKuliah mk2 = new MataKuliah("MIK1624402", "Pemrograman Berorientasi Objek", 3); // membuat objek mata kuliah PBO
        MataKuliah mk3 = new MataKuliah("MIK1624403", "Manajemen Basis Data", 3); // membuat objek mata kuliah MBD
        MataKuliah mk4 = new MataKuliah("MIK1624404", "Analisis dan Strategi Algoritma", 3); // membuat objek mata kuliah ASA
        MataKuliah mk5 = new MataKuliah("MIK1624405", "Kecerdasan Buatan", 3); // membuat objek mata kuliah AI
        MataKuliah mk6 = new MataKuliah("MIK1624406", "Grafik dan Teknik Interaktif", 3); // membuat objek mata kuliah GTI
        MataKuliah mk7 = new MataKuliah("MIK1624601", "Keamanan dan Jaminan Informasi", 3); // membuat objek mata kuliah KJI
        MataKuliah mk8 = new MataKuliah("MIK1624603", "Interaksi Manusia Komputer", 3); // membuat objek mata kuliah IMK

        m1.setDosenWali(d1); // mengeset dosen wali  mahasiswa pertama
        m1.setKendaraan(k1); // mengeset kendaraan mahasiswa pertama

        m1.addMatKul(mk1); // menambahkan mata kuliah 
        m1.addMatKul(mk2); // menambahkan mata kuliah 
        m1.addMatKul(mk3); // menambahkan mata kuliah 
        m1.addMatKul(mk4); // menambahkan mata kuliah 
        m1.addMatKul(mk5); // menambahkan mata kuliah 
        m1.addMatKul(mk6); // menambahkan mata kuliah 
        m1.addMatKul(mk8); // menambahkan mata kuliah 

        m2.setDosenWali(d2); // mengeset dosen wali mahasiswa kedua
        m2.setKendaraan(k2); // mengeset kendaraan mahasiswa kedua

        m2.addMatKul(mk1); // menambahkan mata kuliah
        m2.addMatKul(mk2); // menambahkan mata kuliah
        m2.addMatKul(mk3); // menambahkan mata kuliah
        m2.addMatKul(mk7); // menambahkan mata kuliah
        m2.addMatKul(mk8); // menambahkan mata kuliah

        m1.printDetailMhs(); // menampilkan detail mahasiswa pertama
        // batasan mahasiswa pertama dan kedua
        System.out.println();
        System.out.println("==================================");
        m2.printDetailMhs(); // menampilkan detail mahasiswa kedua
    }
}