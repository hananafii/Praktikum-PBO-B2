/* Nama File  : DosenTetap.java
 * Deskripsi  : subclass dari Dosen yang merepresentasikan Dosen Tetap
 * Pembuat    : Hana Nafi'atul Haq
 * Tanggal    : 11 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /*************** ATRIBUT ***************/
    private String nidn;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek Dosen Tetap
    public DosenTetap(String nip,String nidn,String nama,
                      LocalDate tanggalLahir,LocalDate tmt,
                      double gajiPokok,String fakultas){
        super(nip,nama,tanggalLahir,tmt,gajiPokok,fakultas);
        this.nidn = nidn;
    }

    // mengembalikan NIDN
    public String getNidn(){
        return nidn;
    }

    // mengubah NIDN
    public void setNidn(String nidn){
        this.nidn = nidn;
    }

    // menghitung tunjangan dosen tetap
    @Override
    public double hitungTunjangan(){
        return 0.02 * getMasaKerja().getYears() * gajiPokok;
    }

    // menghitung tanggal pensiun dosen tetap
    public LocalDate getTanggalPensiun(){
        return tanggalLahir.plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    // menampilkan informasi dosen tetap
    @Override
    public void printInfo(){
        System.out.println("DATA DOSEN TETAP");
        super.printInfo(); 
        System.out.println("NIDN                : " + nidn);
        System.out.println("Jabatan             : Dosen Tetap");
        System.out.println("Fakultas            : " + fakultas);
        System.out.println("Masa Kerja          : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun     : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Tunjangan           : 2% x " + getMasaKerja().getYears() + " x " + formatRupiah(gajiPokok)
                            + " = " + formatRupiah(hitungTunjangan()));
    }
}