/* Nama File   : Anjing.java
 * Deskripsi   : Class Anjing turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 6 Mei 2026
 */

public class Anjing extends Anabul {

    // konstruktor tanpa parameter
    public Anjing() {
        super();
    }

    // konstruktor nama
    public Anjing(String nama) {
        super(nama);
    }

    // override suara
    @Override
    public void suara() {
        System.out.println("Guk-guk");
    }

    // override gerak
    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}