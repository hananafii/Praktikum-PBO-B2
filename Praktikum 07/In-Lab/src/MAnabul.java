/* Nama File   : MAnabul.java
 * Deskripsi   : Program utama untuk simulasi polimorfisme Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

public class MAnabul {
    public static void main(String[] args) {
        // Membuat objek baru
        Anabul kucing = new Kucing();
        Anabul anjing = new Anjing();
        Anabul burung = new Burung();

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