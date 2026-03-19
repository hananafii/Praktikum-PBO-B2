/* Nama File   : PNS.java
 * Deskripsi   : berisi atribut dan method dalam class PNS
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

import java.time.LocalDate;

public class PNS extends Manusia implements IPajak {
    /*************** ATRIBUT ***************/
    private String nip;
    private static int counterPNS = 0;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek PNS
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // mengembalikan NIP
    public String getNip() {
        return nip;
    }

    // mengeset NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // mengembalikan jumlah objek PNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    // menghitung pajak PNS (10%)
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    // menghitung masa kerja PNS dalam tahun 
    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 1; // A = 1 (digit ke-14 dari 24060124130081)
    }   

    // mencetak informasi lengkap PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP         : " + nip);
        System.out.println("Pajak       : " + hitungPajak());
    }
}