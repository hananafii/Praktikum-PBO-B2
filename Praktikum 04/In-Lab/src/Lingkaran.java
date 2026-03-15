/* Nama File   : Lingkaran.java
 * Deskripsi   : berisi atribut dan method dalam class Lingkaran
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 11 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    /*************** ATRIBUT ***************/
    private double jari;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek Lingkaran
    public Lingkaran() {
        super(); // memanggil konstruktor kosong BangunDatar
        this.jmlSisi = 1;
    }

    // konstruktor dengan parameter
    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border); // memanggil konstruktor BangunDatar
        this.jari = diameter / 2;
    }

    // mengembalikan nilai jari-jari
    public double getJari() {
        return jari;
    }

    // mengeset nilai jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // menghitung luas lingkaran
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // mencetak informasi lingkaran
    @Override
    public void printInfo() {
        super.printInfo(); // memanggil printInfo dari BangunDatar
        System.out.println("Jari-jari       : " + jari);
        System.out.println("Luas            : " + getLuas());
        System.out.println("Keliling        : " + getKeliling());
    }
}