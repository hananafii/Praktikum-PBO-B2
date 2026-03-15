/* Nama File  : Dosen.java
 * Deskripsi  : subclass dari Pegawai yang merepresentasikan Dosen
 * Pembuat    : Hana Nafi'atul Haq
 * Tanggal    : 11 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    /*************** ATRIBUT ***************/
    protected String fakultas;

    /*************** METHOD ***************/
    // konstruktor untuk membuat objek Dosen
    public Dosen(String nip, String nama, LocalDate tanggalLahir,
                 LocalDate tmt, double gajiPokok, String fakultas){
        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.fakultas = fakultas;
    }

    // mengembalikan fakultas
    public String getFakultas(){
        return fakultas;
    }

    // mengubah fakultas
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
}