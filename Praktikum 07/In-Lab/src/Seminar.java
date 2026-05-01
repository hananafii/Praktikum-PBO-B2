/* Nama File   : Seminar.java
 * Deskripsi   : Class untuk mengelola peserta seminar
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

public class Seminar {
    private CivitasAkademika[] pesertas; 
    private int banyakPeserta;           

    // konstruktor seminar
    public Seminar() {
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    // menghitung jumlah peserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // menambahkan peserta ke dalam seminar
    public void registrasi(CivitasAkademika ca) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = ca;
            banyakPeserta++;
        }
    }
  
   // menampilkan seluruh peserta seminar
    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println("Peserta ke-" + (i + 1));
            System.out.println("Nomor : " + pesertas[i].getNomor());
            System.out.println("Nama  : " + pesertas[i].getNama());
            System.out.println();
        }
    }

    // menghitung jumlah mahasiswa menggunakan instanceof
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaCA) {
                count++;
            }
        }
        return count;
    }
}