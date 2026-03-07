/* Nama File   : Garis.java
 * Deskripsi   : berisi atribut dan method dalam clss Garis
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 25 Februari 2026
 */

public class Garis {
    /*************** ATRIBUT ***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*************** METHOD ***************/
    // konstruktor 
    // menginisialisasi titikAwal (0,0) dan titikAkhir (1,1)
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // konstruktor dengan parameter
    // menerima dua objek Titik sebagai titik awal dan akhir
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // mengembalikan titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // mengembalikan titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // mengeset titik awal
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // mengeset titik akhir
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // mengembalikan jumlah objek garis yang telah dibuat
    public static int getCounterGaris() {
        return counterGaris;
    }

    // menghitung panjang garis
    // menggunakan method getJarak() dari class Titik
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // menghitung gradien garis
    // rumus: m = (y2 - y1) / (x2 - x1)
    public double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        // jika garis vertikal, gradien tak terdefinisi
        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return (y2 - y1) / (x2 - x1);
    }

    // menghitung titik tengah garis
    // rumus: ((x1+x2)/2 , (y1+y2)/2)
    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;

        return new Titik(xTengah, yTengah);
    }

    // mengecek apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // mengecek apakah garis tegak lurus dengan garis lain
    // dua garis tegak lurus jika m1 * m2 = -1
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // menampilkan titik awal dan titik akhir
    public void printGaris() {
        System.out.print("Titik Awal : ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // menampilkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        
        double c = y1 - (m * x1); // mencari konstanta c dengan rumus y = mx + c || c = y - mx

        return "y = " + m + "x + " + c;
    }
}