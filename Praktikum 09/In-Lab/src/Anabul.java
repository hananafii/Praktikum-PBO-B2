/* Nama File   : Anabul.java
 * Deskripsi   : Class induk hewan peliharaan
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 6 Mei 2026
 */

public class Anabul {
    private String nama;

    // konstruktor tanpa parameter
    public Anabul() {
        this.nama = "";
    }

    // konstruktor dengan parameter
    public Anabul(String nama) {
        this.nama = nama;
    }

    // mengambil nama
    public String getNama() {
        return nama;
    }

    // mengeset nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // menampilkan suara default
    public void suara() {
        System.out.println("Suara anabul");
    }

    // menampilkan gerakan default
    public void gerak() {
        System.out.println("Gerakan anabul");
    }
}