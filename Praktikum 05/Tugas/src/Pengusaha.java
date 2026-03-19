/* Nama File   : Pengusaha.java
 * Deskripsi   : berisi atribut dan method dalam class Pengusaha
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

import java.time.LocalDate;

public class Pengusaha extends Manusia implements IPajak {
    /*************** ATRIBUT ***************/
    private String npwp;
    private static int counterPengusaha = 0;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek Pengusaha
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // mengembalikan NPWP
    public String getNpwp() {
        return npwp;
    }

    // mengeset NPWP
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // mengembalikan jumlah objek Pengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // menghitung pajak Pengusaha (15%)
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // menghitung masa kerja pengusaha dalam tahun
    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 8; // B = 8 (digit ke-13 dari 24060124130081)
    }

    // mencetak informasi lengkap Pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP        : " + npwp);
        System.out.println("Pajak       : " + hitungPajak());
    }
}