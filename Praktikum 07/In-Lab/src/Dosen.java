/* Nama File   : Dosen.java
 * Deskripsi   : Class Dosen turunan CivitasAkademika
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

class Dosen extends CivitasAkademika {
    private String nip;

    // konstruktor
    Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    // mengembalikan NIP dosen
    public String getNip() {
        return nip;
    }

    // mengeset NIP dosen
    public void setNip(String nip) {
        this.nip = nip;
    }

    // mengembalikan nomor (NIP)
    @Override
    public String getNomor() {
        return nip;
    }
} 