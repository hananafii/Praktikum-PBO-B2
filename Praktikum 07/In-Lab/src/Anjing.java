/* Nama File   : Anjing.java
 * Deskripsi   : Class Anjing turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

class Anjing extends Anabul {
    // override suara anjing
    @Override
    void suara() {
        System.out.println("Guk-guk");
    }

    // override gerakan anjing
    @Override
    void gerak() {
        System.out.println("Melata");
    }
} 