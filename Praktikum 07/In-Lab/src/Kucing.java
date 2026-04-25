/* Nama File   : Kucing.java
 * Deskripsi   : Class Kucing turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

class Kucing extends Anabul {
    // override suara kucing
    @Override
    void suara() {
        System.out.println("Meong");
    }

    // override gerakan kucing
    @Override
    void gerak() {
        System.out.println("Melata");
    }
} 