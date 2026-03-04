/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 25 Februari 2026
 */

public class TitikLengkap {
    /*************** ATRIBUT ***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*************** METHOD ***************/

    // konstruktor untuk membuat titik (0,0)
    public TitikLengkap() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    // konstruktor untuk membuat titik dengan absis dan ordinat tertentu
    public TitikLengkap(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // mengembalikan nilai absis
    public double getAbsis() {
        return this.absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat() {
        return this.ordinat;
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        this.absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // menentukan kuadran dari sebuah titik
    public int getKuadran() {
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }
    // menghitung jarak titik ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
    }

    // menghitung jarak antara titik ini dengan titik T
    public double getJarak(TitikLengkap T) {
        double a = this.absis - T.getAbsis();
        double b = this.ordinat - T.getOrdinat();
        return Math.sqrt(a * a + b * b);
    }

    // merefleksikan titik terhadap sumbu X (mengubah objek itu sendiri)
    public void refleksiX() {
        this.ordinat = this.ordinat * -1;
    }

    // merefleksikan titik terhadap sumbu Y (mengubah objek itu sendiri)
    public void refleksiY() {
        this.absis = this.absis * -1;
    }

    // menghasilkan titik baru hasil refleksi terhadap sumbu X
    public TitikLengkap getRefleksiX() {
        return new TitikLengkap(this.absis, this.ordinat * -1);
    }

    // menghasilkan titik baru hasil refleksi terhadap sumbu Y
    public TitikLengkap getRefleksiY() {
        return new TitikLengkap(this.absis * -1, this.ordinat);
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + this.absis + ", " + this.ordinat + ")");
    }
}