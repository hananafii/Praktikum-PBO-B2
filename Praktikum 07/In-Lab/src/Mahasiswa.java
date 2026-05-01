/* Nama File   : Mahasiswa.java
 * Deskripsi   : Class Mahasiswa dengan konsep polimorfisme ad hoc overloading
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

public class Mahasiswa {
    String nim;
    String nama;
    String programStudi;

    // konstruktor tanpa parameter 
    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // konstruktor dengan 3 buah parameter
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // konstruktor dengan parameter objek Mahasiswa lain
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // mengeset program studi menjadi "Kosong" (varian 1)
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    // mengeset program studi berdasarkan input string (varian 2)
    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    // mengeset program studi dari objek Mahasiswa lain (varian 3)
    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    // menampilkan data mahasiswa
    public void tampil() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + programStudi);
    }
}