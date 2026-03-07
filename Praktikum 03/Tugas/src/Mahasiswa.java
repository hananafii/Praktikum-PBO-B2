public class Mahasiswa {
    /*************** ATRIBUT ***************/
    private String nim;
    private String nama;
    private String prodi;
    private static MataKuliah[] listMatKul = new MataKuliah[50];
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    private int jumlahMatKul = 0;

    /*************** METHOD ***************/
    // konstruktor tanpa parameter
    // menginisialisasi nim, nama, dan prodi dengan string kosong
     public Mahasiswa() {
        nim = "";
        nama = "";
        prodi = "";
    }

    // konstruktor dengan parameter
    // menerima nim, nama, dan prodi
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // mengembalikan nim
    public String getNim() {
        return nim;
    }

    // mengembalikan nama
    public String getNama() {
        return nama;
    }

    // mengembalikan prodi
    public String getProdi() {
        return prodi;
    }

    // mengembalikan dosen wali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // mengembalikan kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // mengeset nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // mengeset nama dengan nama baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengeset prodi dengan prodi baru
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // mengeset dosen wali dengan dosen wali baru
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // mengeset kendaraan dengan kendaraan baru
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // menambahkan mata kuliah ke dalam listMatKul
    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        }
    }

    // menghitung jumlah SKS yang diambil mahasiswa
    public int getJumlahSKS() {
        int totalSKS = 0;
        int i;

        for (i = 0; i < jumlahMatKul; i++) {
            totalSKS += listMatKul[i].getSks();
        }
        return totalSKS;
    }

    // mengembalikan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    // menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    // menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("Data mahasiswa ");
        printMhs();

        System.out.println("\nDosen Wali:");
        System.out.println("NIP   : " + dosenWali.getNip());
        System.out.println("Nama  : " + dosenWali.getNama());
        System.out.println("Prodi : " + dosenWali.getProdi());

        System.out.println("\nKendaraan:");
        System.out.println("No Plat : " + kendaraan.getNoPlat());
        System.out.println("Jenis   : " + kendaraan.getJenis());

        System.out.println("\nDaftar Mata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println(
                listMatKul[i].getIdMatKul() + " - " + listMatKul[i].getNama() + 
                " (" + listMatKul[i].getSks() + " SKS)"
            );
        }

        System.out.println("\nJumlah Mata Kuliah : " + getJumlahMatKul());
        System.out.println("Total SKS          : " + getJumlahSKS());
    }
}
