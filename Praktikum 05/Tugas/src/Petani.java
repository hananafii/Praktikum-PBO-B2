/* Nama File   : Petani.java
 * Deskripsi   : berisi atribut dan method dalam class Petani
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

import java.time.LocalDate;

public class Petani extends Manusia implements IPajak {
    /*************** ATRIBUT ***************/
    private String asalKota;
    private static int counterPetani = 0;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek Petani
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    // mengembalikan asal kota
    public String getAsalKota() {
        return asalKota;
    }

    // mengeset asal kota
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    // mengembalikan jumlah objek Petani
    public static int getCounterPetani() {
        return counterPetani;
    }

    // menghitung pajak Petani (0)
    @Override
    public double hitungPajak() {
        return 0;
    }

    // menghitung masa kerja petani dalam tahun
    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 0; // C = 0 (digit ke-12 dari 24060124130081)
    }

    // mencetak informasi lengkap Petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota   : " + asalKota);
        System.out.println("Pajak       : " + hitungPajak());
    }
}