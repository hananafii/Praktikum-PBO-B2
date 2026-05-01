/* Nama File   : Kucing.java
 * Deskripsi   : Class Kucing turunan Anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 April 2026
 */

public class Kucing extends Anabul {
    private double bobot; 

    // konstruktor tanpa parameter
    public Kucing() {
        this.bobot = 0;
    }

    // konstruktor dengan parameter
    public Kucing(double bobot) {
        this.bobot = bobot;
    }

    // mengembalikan bobot kucing
    public double getBobot() {
        return bobot;
    }

    // mengeset bobot kucing
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    // menampilkan suara kucing
    @Override
    public void suara() {
        System.out.println("Meong");
    }

    // menampilkan gerakan kucing
    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}