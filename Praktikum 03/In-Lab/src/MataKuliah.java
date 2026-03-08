public class MataKuliah {
    /*************** ATRIBUT ***************/
    private String idMatKul;
    private String nama;
    private int sks;

    /*************** METHOD ***************/
    // konstruktor tanpa parameter
    // menginisialisasi idMatKul dan nama dengan string kosong dan sks dengan nilai 0
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    // konstruktor dengan parameter
    // menerima idMatKul, nama, dan sks
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // mengembalikan idMatKul
    public String getIdMatKul() {
        return idMatKul;
    }

    // mengembalikan nama
    public String getNama() {
        return nama;
    }

    // mengembalikan sks
    public int getSks() {
        return sks;
    }

    // mengeset idMatKul dengan idMatkul baru
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    // mengeset nama dengan nama baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengeset sks degngan sks baru
    public void setSks(int sks) {
        this.sks = sks;
    }
}
