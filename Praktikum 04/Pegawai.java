/* Nama File  : Pegawai.java
 * Deskripsi  : berisi atribut dan method dalam class Pegawai
 * Pembuat    : Hana Nafi'atul Haq
 * Tanggal    : 11 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {
    /*************** ATRIBUT ***************/
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // mengubah angka bulan menjadi nama bulan
    protected static final String[] BULAN = {
        "Januari","Februari","Maret","April","Mei","Juni",
        "Juli","Agustus","September","Oktober","November","Desember"
    };

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek Pegawai
    public Pegawai(String nip, String nama, LocalDate tanggalLahir,
                   LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // mengembalikan nilai NIP
    public String getNip(){
        return nip;
    }

    // mengubah nilai NIP
    public void setNip(String nip){
        this.nip = nip;
    }

    // mengembalikan nama pegawai
    public String getNama(){
        return nama;
    }

    // mengubah nama pegawai
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengembalikan tanggal lahir
    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }

    // mengubah tanggal lahir
    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    // mengembalikan TMT
    public LocalDate getTmt(){
        return tmt;
    }

    // mengubah TMT
    public void setTmt(LocalDate tmt){
        this.tmt = tmt;
    }

    // mengembalikan gaji pokok
    public double getGajiPokok(){
        return gajiPokok;
    }

    // mengubah gaji pokok
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    // menghitung masa kerja pegawai
    public Period getMasaKerja(){
        LocalDate sekarang = LocalDate.of(2025,3,1);
        return Period.between(tmt, sekarang);
    }

    // memformat masa kerja menjadi tahun dan bulan
    public String formatMasaKerja(){
        Period p = getMasaKerja();
        return p.getYears()+" tahun "+p.getMonths()+" bulan";
    }

    // memformat tanggal menjadi format Indonesia
    public String formatTanggal(LocalDate tanggal){
        return tanggal.getDayOfMonth() + " " + BULAN[tanggal.getMonthValue()-1] + " " + tanggal.getYear();
    }

    // memformat angka menjadi rupiah
    public String formatRupiah(double uang){
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        return nf.format(uang);
    }

    // method menghitung tunjangan (akan dioverride)
    public double hitungTunjangan(){
        return 0;
    }

    // method menampilkan informasi pegawai
    // menampilkan informasi umum pegawai
    public void printInfo(){
        System.out.println("NIP                 : " + nip);
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Lahir       : " + formatTanggal(tanggalLahir));
        System.out.println("TMT                 : " + formatTanggal(tmt));
        System.out.println("Gaji Pokok          : " + formatRupiah(gajiPokok));
    }
}