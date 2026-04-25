/* Nama File   : Burung.java
 * Deskripsi   : Class Burung turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

class Burung extends Anabul {
    // override suara burung
    @Override
    void suara() {
        System.out.println("Cuit");
    }

    // override gerakan burung
    @Override
    void gerak() {
        System.out.println("Terbang");
    }
} 