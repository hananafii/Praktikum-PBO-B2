/* Nama File   : MDatum.java
 * Deskripsi   : Program utama aplikasi Datum
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 April 2026
 */

public class MDatum {
    public static void main(String[] args) {

        // Kamus
        Anggora anggora;
        Anjing anjing;
        Burung burung;

        Datum<Anggora> d1;
        Datum<Anjing> d2;
        Datum<Burung> d3;

        // Algoritma
        // Membuat objek hewan
        anggora = new Anggora(4.5);
        anjing  = new Anjing();
        burung  = new Burung();

        // Membuat objek Datum
        d1 = new Datum<>(anggora);
        d2 = new Datum<>(anjing);
        d3 = new Datum<>(burung);

        // Menampilkan data Anggora
        System.out.println("Datum Anggora");
        d1.getIsi().suara();
        System.out.println("Bobot : " + d1.getIsi().getBobot());

        // Menampilkan data Anjing
        System.out.println("\nDatum Anjing");
        d2.getIsi().suara();

        // Menampilkan data Burung
        System.out.println("\nDatum Burung");
        d3.getIsi().suara();
    }
}