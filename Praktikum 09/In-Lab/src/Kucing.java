/* Nama File   : Kucing.java
 * Deskripsi   : Class Kucing turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 6 Mei 2026
 */

public class Kucing extends Anabul {
    private double bobot;

    // konstruktor tanpa parameter
    public Kucing() {
        super();
        this.bobot = 0;
    }

    // konstruktor dengan parameter
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // mengambil bobot
    public double getBobot() {
        return bobot;
    }

    // mengeset bobot
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    // override suara
    @Override
    public void suara() {
        System.out.println("Meong");
    }

    // override gerak
    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}