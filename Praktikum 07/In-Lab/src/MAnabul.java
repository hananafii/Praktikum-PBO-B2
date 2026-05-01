/* Nama File   : MAnabul.java
 * Deskripsi   : Program utama untuk simulasi polimorfisme Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

public class MAnabul {
    public static void main(String[] args) {

        // kamus
        Anabul kucing;
        Anabul anjing;
        Anabul burung;

        // algoritma

        // Membuat objek baru
        kucing = new Kucing();
        anjing = new Anjing();
        burung = new Burung();

        // kucing
        System.out.println("Kucing");
        kucing.suara();
        kucing.gerak();

        // anjing
        System.out.println("\nAnjing");
        anjing.suara();
        anjing.gerak();

        // burung
        System.out.println("\nBurung");
        burung.suara();
        burung.gerak();
    }
}