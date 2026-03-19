/* Nama File   : Lingkaran.java
 * Deskripsi   : berisi atribut dan method dalam class Lingkaran
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    /*************** ATRIBUT ***************/
    private double jari;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek Lingkaran
    public Lingkaran() {
        super();
        this.jmlSisi = 1;
    }

    // konstruktor dengan parameter
    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
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
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // menghitung keliling lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // mencetak informasi lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari       : " + jari);
        System.out.println("Luas            : " + getLuas());
        System.out.println("Keliling        : " + getKeliling());
    }

    // Implementasi interface
    // menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    // mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }
    
    // menskalakan ukuran sesuai dengan input percent yang diberikan 
    @Override
    public void zoom(int percent){
        jari = jari * percent / 100.0;
    }
}