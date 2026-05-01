/* Nama File   : Kucing.java
 * Deskripsi   : Class Kucing turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

public class Kucing extends Anabul {
    
    // override suara kucing
    @Override
    public void suara() {
        System.out.println("Meong");
    }

    // override gerakan kucing
    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}