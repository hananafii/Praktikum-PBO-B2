/* Nama File   : MainBangunDatar.java
 * Deskripsi   : berisi atribut dan method dalam clss MainBangunDatar
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 11 Maret 2026
 */

public class MainBangunDatar {
    public static void main(String[] args) {
        // membuat objek Persegi
        Persegi P1 = new Persegi();
        P1.setSisi(5);
        P1.setWarna("Merah");
        P1.setBorder("Hitam");

        // menampilkan informasi Persegi 1
        System.out.println("\nPersegi 1");
        P1.printInfo();

        // memanggil method keliling dan diagonal
        System.out.println("Keliling        : " + P1.getKeliling());
        System.out.println("Diagonal        : " + P1.getDiagonal());
        System.out.println();

        // membuat objek Persegi dengan konstruktor parameter
        Persegi P2 = new Persegi(8, "Biru", "Putih");
        
        // menampilkan informasi Persegi 2
        System.out.println("Persegi 2");
        P2.printInfo();

        // memanggil method keliling dan diagonal
        System.out.println("Keliling        : " + P2.getKeliling());
        System.out.println("Diagonal        : " + P2.getDiagonal());
        System.out.println();

        // membuat objek Lingkaran
        Lingkaran L1 = new Lingkaran();
        L1.setJari(7);
        L1.setWarna("Hijau");
        L1.setBorder("Hitam");

        // menampilkan informasi lingkaran 1
        System.out.println("Lingkaran 1");
        L1.printInfo();
        System.out.println();

        // membuat objek Lingkaran dengan konstruktor parameter
        Lingkaran L2 = new Lingkaran(14, "Kuning", "Merah");

        // menampilkan informasi lingkaran 2 
        System.out.println("Lingkaran 2");
        L2.printInfo();

        // menampilkan jumlah objek BangunDatar
        System.out.println("\nTotal Objek");
        BangunDatar.printCounterBangunDatar();
    }
}