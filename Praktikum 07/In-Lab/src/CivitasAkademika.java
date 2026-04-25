/* Nama File   : CivitasAkademika.java
 * Deskripsi   : Class induk civitas akademika
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

class CivitasAkademika {
    private String nama; 

    // konstruktor tanpa parameter
    CivitasAkademika() {
        this.nama = "n/a";
    }

    // konstruktor dengan parameter
    CivitasAkademika(String nama) {
        this.nama = nama;
    }

    // mengembalikan nama civitas
    public String getNama() {
        return nama;
    }

    // mengeset nama civitas
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengembalikan nomor
    public String getNomor() {
        return "";
    }
} 