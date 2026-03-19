/* Nama File   : BangunDatar.java
 * Deskripsi   : berisi atribut dan method dalam class Bangun Datar (abstract)
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

public abstract class BangunDatar {
    /*************** ATRIBUT ***************/
    protected int jmlSisi;
    protected String warna;
    protected String border;

    private static int counterBangunDatar = 0;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek bangun datar
    public BangunDatar() {
        counterBangunDatar++;
    }

    // konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // mengembalikan jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // mengeset jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // mengembalikan warna bangun datar
    public String getWarna() {
        return warna;
    }

    // mengeset warna bangun datar
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // mengembalikan border bangun datar
    public String getBorder() {
        return border;
    }

    // mengeset border bangun datar
    public void setBorder(String border) {
        this.border = border;
    }

    // mencetak jumlah objek bangun datar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // mencetak informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi     : " + jmlSisi);
        System.out.println("Warna           : " + warna);
        System.out.println("Border          : " + border);
    }

    // ABSTRACT METHOD
    public abstract double getLuas();
    public abstract double getKeliling();

    // METHOD PERBANDINGAN
    // membandingkan apakah kedua luas antara kedua bangun datar sama
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // membandingkan apakah kedua keliling antara kedua bangun datar sama
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    
    }
}