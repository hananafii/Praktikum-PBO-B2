/* Nama File   : BangunDatar.java
 * Deskripsi   : berisi atribut dan method dalam clss Bangun Datar
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 11 Maret 2026
 */

public class BangunDatar {
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
}