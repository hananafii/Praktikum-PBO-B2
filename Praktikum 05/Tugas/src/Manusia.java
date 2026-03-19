/* Nama File   : Manusia.java
 * Deskripsi   : berisi atribut dan method dalam class Manusia
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
    /*************** ATRIBUT ***************/
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;

    private static int counterMns = 0;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek manusia
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // mengembalikan nama
    public String getNama() {
        return nama;
    }

    // mengeset nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengembalikan tanggal mulai kerja
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    // mengeset tanggal mulai kerja
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    // mengembalikan alamat
    public String getAlamat() {
        return alamat;
    }

    // mengeset alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // mengembalikan pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    // mengeset pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // mengembalikan jumlah objek manusia
    public static int getCounterMns() {
        return counterMns;
    }

    // menghitung masa kerja dalam tahun
    public int hitungMasaKerja() {
        return Period.between(tglMulaiKerja, LocalDate.now()).getYears();
    }

    // mencetak informasi manusia
    public void cetakInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Tgl Mulai   : " + tglMulaiKerja);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Pendapatan  : " + pendapatan);
        System.out.println("Masa Kerja  : " + hitungMasaKerja() + " tahun");
    }
}