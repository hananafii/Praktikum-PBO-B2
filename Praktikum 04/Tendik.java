/* Nama File  : Tendik.java
 * Deskripsi  : subclass dari Pegawai yang merepresentasikan Tenaga Kependidikan (Tendik)
 * Pembuat    : Hana Nafi'atul Haq
 * Tanggal    : 11 Maret 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {

    /*************** ATRIBUT ***************/
    
    // bidang tempat tendik bekerja (Akademik, Kemahasiswaan, atau Sumber Daya)
    private String bidang;

    /*************** METHOD ***************/

    // konstruktor untuk membuat objek Tendik
    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang){

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // mengembalikan nilai bidang
    public String getBidang(){
        return bidang;
    }

    // mengeset nilai bidang dengan nilai baru
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    // menghitung tunjangan tendik
    // tunjangan = 1% x masa kerja (tahun) x gaji pokok
    @Override
    public double hitungTunjangan(){
        return 0.01 * getMasaKerja().getYears() * gajiPokok;
    }

    // menghitung tanggal pensiun tendik
    public LocalDate getTanggalPensiun(){
        return tanggalLahir.plusYears(55).withDayOfMonth(1).plusMonths(1);
    }

    // menampilkan informasi tendik
    @Override
    public void printInfo(){
        System.out.println("DATA TENDIK");
        super.printInfo();
        System.out.println("Jabatan             : Tendik");
        System.out.println("Bidang              : " + bidang);
        System.out.println("Masa Kerja          : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun     : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Tunjangan           : 1% x " + getMasaKerja().getYears() + " x " + formatRupiah(gajiPokok)
                            + " = " + formatRupiah(hitungTunjangan()));
    }
}