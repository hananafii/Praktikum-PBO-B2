/* Nama File   : MainBangunDatar.java
 * Deskripsi   : class utama untuk menjalankan program
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

public class MainBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar();
        // Error

        // membuat objek dengan konstruktor parameter
        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");

        BangunDatar L1 = new Lingkaran(14, "Hijau", "Kuning");
        Lingkaran L2 = new Lingkaran(14, "Hitam", "Putih");

        // menampilkan informasi bangun datar yang telah dibuat
        System.out.println("Persegi 1");
        P1.printInfo();

        System.out.println("\nPersegi 2");
        P2.printInfo();

        System.out.println("\nLingkaran 1");
        L1.printInfo();

        System.out.println("\nLingkaran 2");
        L2.printInfo();

        // PERBANDINGAN
        System.out.println("\nPERBANDINGAN");
        System.out.println("Luas Persegi 1 dan Persegi 2 : " + P1.isEqualLuas(P2));
        System.out.println("Keliling Lingkaran 1 dan Lingkaran 2 : " + L1.isEqualKeliling(L2));

        // INTERFACE (IRESIZE)
        System.out.println("\nRESIZE");
        P2.zoomIn();
        L2.zoomOut();
        
        // menampilkan objek BangunDatar setelah resize (zoomIn dan zoomOut)
        System.out.println("Setelah Resize:");
        System.out.println("Persegi 2");
        P2.printInfo();

        System.out.println("\nLingkaran 2");
        L2.printInfo();

        P2.zoom(200);
        L2.zoom(50);

        // menampilkan objek BangunDatar setelah resize (zoom)
        System.out.println("\nSetelah zoom");
        System.out.println("Persegi 2");
        P2.printInfo();

        System.out.println("\nLingkaran 2");
        L2.printInfo();

        // menampilkan jumlah objek BangunDatar
        System.out.println("\nTotal Objek:");
        BangunDatar.printCounterBangunDatar();
    }
}