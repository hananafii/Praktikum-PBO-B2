/* Nama File   : MData.java
 * Deskripsi   : Program utama class Data
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 April 2026
 */

public class MData {
    public static void main(String[] args) {

        // Kamus
        Data<Anabul> dataHewan;

        Anggora anjing;
        Kucing kucing;
        Kembangtelon burung;

        // Algoritma
        // Membuat objek Data
        dataHewan = new Data<>();

        // Membuat objek Anabul
        anjing = new Anggora();
        kucing = new Kucing(4.5);
        burung = new Kembangtelon();

        // Mengisi data ke dalam array generic
        dataHewan.setIsi(1, anjing);
        dataHewan.setIsi(2, kucing);
        dataHewan.setIsi(3, burung);

        // Menampilkan isi data menggunakan getIsi
        System.out.println("Data posisi 1");
        dataHewan.getIsi(1).suara();

        System.out.println("\nData posisi 2");
        dataHewan.getIsi(2).suara();

        System.out.println("\nData posisi 3");
        dataHewan.getIsi(3).suara();

        // Menampilkan jumlah elemen efektif
        System.out.println("\nJumlah elemen:");
        System.out.println(dataHewan.getSize());
    }
}