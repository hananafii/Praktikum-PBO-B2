/* Nama File   : Burung.java
 * Deskripsi   : Class Burung turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 Maret 2026
 */

public class Burung extends Anabul {

    // override suara burung
    @Override
    public void suara() {
        System.out.println("Cuit");
    }

    // override gerakan burung
    @Override
    public void gerak() {
        System.out.println("Terbang");
    }
}