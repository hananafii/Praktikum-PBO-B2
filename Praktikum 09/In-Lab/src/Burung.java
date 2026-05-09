/* Nama File   : Burung.java
 * Deskripsi   : Class Burung turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 6 Mei 2026
 */

public class Burung extends Anabul {

    // konstruktor tanpa parameter
    public Burung() {
        super();
    }

    // konstruktor nama
    public Burung(String nama) {
        super(nama);
    }

    // override suara
    @Override
    public void suara() {
        System.out.println("Cuit");
    }

    // override gerak
    @Override
    public void gerak() {
        System.out.println("Terbang");
    }
}