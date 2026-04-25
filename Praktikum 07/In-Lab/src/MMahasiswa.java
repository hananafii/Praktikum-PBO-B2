/* Nama File   : MMahasiswa.java
 * Deskripsi   : Aplikasi pengujian konstruktor class Mahasiswa
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // konstruktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();

        // konstruktor dengan 3 buah parameter
        Mahasiswa m2 = new Mahasiswa("001", "Hana Nafi'atul Haq", "Informatika");

        // konstruktor dengan parameter objek Mahasiswa lain
        Mahasiswa m3 = new Mahasiswa(m2);

        // setProgramStudi varian 1
        m1.setProgramStudi();

        // setProgramStudi varian 2
        m2.setProgramStudi("Sistem Informasi");

        // setProgramStudi varian 3
        m3.setProgramStudi(m2);

        // menampilkan objek Mahasiswa 1, 2, dan 3
        System.out.println("Varian 1");
        m1.tampil();

        System.out.println("\nVarian 2");
        m2.tampil();

        System.out.println("\nVarian 3");
        m3.tampil();
    }
}