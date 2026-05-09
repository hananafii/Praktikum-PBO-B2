/* Nama File   : MPiaraan.java
 * Deskripsi   : Main class aplikasi Piaraan
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 6 Mei 2026
 */

public class MPiaraan {
    public static void main(String[] args) {

        // Kamus
        Piaraan p;
        Anggora a1;
        Kembangtelon k1;
        Anjing anj;
        Burung bur;

        // Algoritma
        // membuat objek piaraan
        p = new Piaraan();

        // membuat objek kucing
        a1 = new Anggora("Milo", 4.5);
        k1 = new Kembangtelon("Oyen", 3.2);

        // membuat objek anjing dan burung
        anj = new Anjing();
        bur = new Burung();

        // mengeset nama anjing dan burung
        anj.setNama("Doggy");
        bur.setNama("Ciko");

        // menambahkan anabul ke antrean
        p.enqueueAnabul(a1);
        p.enqueueAnabul(k1);
        p.enqueueAnabul(anj);
        p.enqueueAnabul(bur);

        // menampilkan seluruh anabul
        p.showAnabul();

        // menampilkan jumlah elemen
        System.out.println("\nJumlah elemen : " + p.getNbelm());

        // menampilkan anabul pertama
        System.out.println("Anabul pertama : " + p.getAnabul().getNama());

        // menampilkan jumlah kucing
        System.out.println("Jumlah kucing : " + p.countKucing());

        // menampilkan total bobot kucing
        System.out.println("Total bobot kucing : " + p.bobotKucing() + " kg");

        // menampilkan jenis objek anabul
        System.out.println("\nJenis objek anabul:");
        p.showJenisAnabul();

        // menghapus anabul pertama dari antrean
        System.out.println("\nDequeue : " + p.dequeueAnabul().getNama());

        // menampilkan ulang isi antrean
        System.out.println("\nSetelah dequeue:");
        p.showAnabul();

        // menampilkan jumlah kucing setelah dequeue
        System.out.println("Jumlah kucing = " + p.countKucing());

    }
}