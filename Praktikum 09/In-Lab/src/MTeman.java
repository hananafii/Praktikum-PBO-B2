/* Nama File   : MTeman.java
 * Deskripsi   : Main class aplikasi teman
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 6 Mei 2026
 */

public class MTeman {
    public static void main(String[] args) {

        // Kamus
        Teman t;

        // Algoritma

        // membuat objek Teman
        t = new Teman();

        // menambahkan nama teman ke koleksi
        t.addNama("Hana");
        t.addNama("Nafi");
        t.addNama("Atul");
        t.addNama("Hana");

        // menampilkan seluruh daftar teman
        t.showTeman();

        // menampilkan jumlah elemen dalam koleksi
        System.out.println("\nJumlah elemen : " + t.getNbelm());

        // mengecek apakah nama tertentu ada di koleksi
        System.out.println("Apakah Nafi member? " + t.isMember("Nafi"));

        // menghitung jumlah kemunculan nama Hana
        System.out.println("Jumlah nama Hana : " + t.countNama("Hana"));

        // mengganti nama Nafi menjadi Haq
        t.gantiNama("Nafi", "Haq");

        // menampilkan daftar setelah ganti nama
        System.out.println("\nSetelah ganti nama:");
        t.showTeman();

        // menghapus nama Atul dari koleksi
        t.delNama("Atul");

        // menampilkan daftar setelah penghapusan
        System.out.println("\nSetelah hapus Atul:");
        t.showTeman();
    }
}