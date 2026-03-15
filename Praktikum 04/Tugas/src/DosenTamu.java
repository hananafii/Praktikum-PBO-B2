/* Nama File  : DosenTamu.java
 * Deskripsi  : subclass dari Dosen yang merepresentasikan Dosen Tamu
 * Pembuat    : Hana Nafi'atul Haq
 * Tanggal    : 11 Maret 2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {

    /*************** ATRIBUT ***************/
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    /*************** METHOD ***************/

    // konstruktor untuk membuat objek Dosen Tamu
    public DosenTamu(String nip,String nidk,String nama,
                     LocalDate tanggalLahir,LocalDate tmt,
                     double gajiPokok,String fakultas,
                     LocalDate tanggalAkhirKontrak){

        super(nip,nama,tanggalLahir,tmt,gajiPokok,fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // mengembalikan nilai NIDK dosen tamu
    public String getNidk(){
        return nidk;
    }

    // mengubah nilai NIDK dosen tamu
    public void setNidk(String nidk){
        this.nidk = nidk;
    }

    // mengembalikan tanggal akhir kontrak dosen tamu
    public LocalDate getTanggalAkhirKontrak(){
        return tanggalAkhirKontrak;
    }

    // mengubah tanggal akhir kontrak dosen tamu
    public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak){
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // menghitung tunjangan dosen tamu sebesar 2.5% dari gaji pokok
    @Override
    public double hitungTunjangan(){
        return 0.025 * gajiPokok;
    }

    // menampilkan informasi dosen tamu
    @Override
    public void printInfo(){
        System.out.println("DATA DOSEN TAMU");
        super.printInfo();
        System.out.println("NIDK                : " + nidk);
        System.out.println("Jabatan             : Dosen Tamu");
        System.out.println("Fakultas            : " + fakultas);
        System.out.println("Masa Kerja          : " + formatMasaKerja());
        System.out.println("Akhir Kontrak       : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Tunjangan           : 2.5% x " + formatRupiah(gajiPokok) + " = " 
                            + formatRupiah(hitungTunjangan()));
    }
}