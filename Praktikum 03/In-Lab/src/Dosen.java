/* Nama File   : Dosen.java
 * Deskripsi   : berisi atribut dan method dalam class Dosen
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 04 Maret 2026
 */

public class Dosen {
    /*************** ATRIBUT ***************/
    private String nip;
    private String nama;
    private String prodi;

    /*************** METHOD ***************/
    // konstruktor tanpa parameter
    // menginisialisasi nip, nama, dan prodi dengan string kosong
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // konstruktor dengan parameter
    // menerima masukan nip, nama, dan prodi
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // mengembalikan nip dosen
    public String getNip() {
        return nip;
    }

    // mengembalikan nama dosen
    public String getNama() {
        return nama;
    }

    // mengembalikan prodi dosen
    public String getProdi() {
        return prodi;
    }

    // mengeset nip dengan nip baru
    public void setNip(String nip) {
        this.nip = nip;
    }

    // mengeset nama dengan nama baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengeset prodi dengan prodi baru
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
