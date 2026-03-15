/* Nama File   : Persegi.java
 * Deskripsi   : berisi atribut dan method dalam class Persegi
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 11 Maret 2026
 */

public class Persegi extends BangunDatar {
    /*************** ATRIBUT ***************/
    private double sisi;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek Persegi
    public Persegi() {
        super(); // memanggil konstruktor kosong BangunDatar
        this.jmlSisi = 4; 
    }

    // konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border); // memanggil konstruktor BangunDatar
        this.sisi = sisi;
    }

    // mengembalikan nilai sisi
    public double getSisi() {
        return sisi;
    }

    // mengeset nilai sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // menghitung luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // menghitung keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    // menghitung diagonal persegi
    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    // mencetak informasi persegi
    @Override
    public void printInfo() {
        super.printInfo(); // memanggil printInfo dari BangunDatar
        System.out.println("Sisi            : " + sisi);
        System.out.println("Luas            : " + getLuas());
    }
}