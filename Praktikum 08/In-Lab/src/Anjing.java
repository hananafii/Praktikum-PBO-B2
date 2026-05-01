/* Nama File   : Anjing.java
 * Deskripsi   : Class Anjing turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 Maret 2026
 */

public class Anjing extends Anabul {

    // override suara anjing
    @Override
    public void suara() {
        System.out.println("Guk-guk");
    }

    // override gerakan anjing
    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}