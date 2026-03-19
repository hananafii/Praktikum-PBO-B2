/* Nama File   : Persegi.java
 * Deskripsi   : berisi atribut dan method dalam class Persegi
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    /*************** ATRIBUT ***************/
    private double sisi;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek Persegi
    public Persegi() {
        super();
        this.jmlSisi = 4;
    }

    // konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
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
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // menghitung keliling persegi
    @Override
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
        super.printInfo();
        System.out.println("Sisi            : " + sisi);
        System.out.println("Luas            : " + getLuas());
        System.out.println("Keliling        : " + getKeliling());
        System.out.println("Diagonal        : " + getDiagonal());
    }

    // Implementasi interface
    // menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    // mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }
    
    // menskalakan ukuran sesuai dengan input percent yang diberikan 
    @Override
    public void zoom(int percent){
        sisi = sisi * percent / 100.0;
    }
}