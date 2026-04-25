/* Nama File   : MahasiswaCA.java
 * Deskripsi   : Class MahasiswaCA turunan CivitasAkademika
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

class MahasiswaCA extends CivitasAkademika {
    private String nim;
    private Dosen dosenWali;

    // konstruktor
    MahasiswaCA(String nim, String nama, Dosen dosenWali) {
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    // mengembalikan NIM mahasiswa
    public String getNim() {
        return nim;
    }

    // mengembalikan dosen wali
    // public Dosen getWali() {
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // mengeset NIM mahasiswa
    public void setNim(String nim) {
        this.nim = nim;
    }

    // mengeset dosen wali 
    // public void setDosenWali(Dosen dosenWali) {
    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // mengembalikan nomor (NIM)
    @Override
    public String getNomor() {
        return nim;
    }

    // menampilkan data mahasiswa lengkap
    public void tampilDataMahasiswa() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + getNama());
        System.out.println("Dosen Wali  : " + dosenWali.getNama());
    }
} 