public class Kendaraan {
    /*************** ATRIBUT ***************/
    private String noPlat;
    private String jenis;

    /*************** METHOD ***************/
    // konstruktor tanpa parameter
    // menginisialisasi noPlat dan jenis dengan string kosong
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // konstruktor dengan parameter
    // menerima noPlat dan jenis kendaraan
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // mengembalikan noPlat
    public String getNoPlat() {
        return noPlat;
    }

    // mengembalikan jenis kendaraan
    public String getJenis() {
        return jenis;
    }

    // mengeset noPlat dengan noPlat baru
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // mengeset jenis kendaraan dengan jenis kendaraan baru
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}
