/* Nama File   : MSeminar.java
 * Deskripsi   : Program utama untuk simulasi Seminar
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

public class MSeminar {
    public static void main(String[] args) {
        // membuat 2 objek dosen
        Dosen d1 = new Dosen("D001", "Budi");
        Dosen d2 = new Dosen("D002", "Sari");

        // membuat 5 objek mahasiswa
        MahasiswaCA m1 = new MahasiswaCA("M001", "Hana", d1);
        MahasiswaCA m2 = new MahasiswaCA("M002", "Nafi", d2);
        MahasiswaCA m3 = new MahasiswaCA("M003", "Atul", d1);
        MahasiswaCA m4 = new MahasiswaCA("M004", "Haq", d2);
        MahasiswaCA m5 = new MahasiswaCA("M005", "Nana", d1);

        // membuat seminar
        Seminar s = new Seminar();

        // menambahkan peserta (registrasi) ke dalam seminar
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // menampilkan jumlah peserta seminar
        System.out.println("Jumlah Peserta: " + s.countPeserta());

        // menampilkan daftar peserta seminar
        System.out.println("\nDaftar Peserta");
        s.tampilPeserta();

        // menghitung jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa: " + s.countMahasiswa());

        // simulasi setWali
        m1.setWali(d2);

        // menampilkan data mahasiswa
        System.out.println("\nData Mahasiswa");
        m1.tampilDataMahasiswa();
        System.out.println();
        m2.tampilDataMahasiswa();
        System.out.println();
        m3.tampilDataMahasiswa();
        System.out.println();
        m4.tampilDataMahasiswa();
        System.out.println();
        m5.tampilDataMahasiswa();
    }
}