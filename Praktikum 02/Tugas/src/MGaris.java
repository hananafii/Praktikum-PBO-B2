/* Nama File   : MGaris.java
 * Deskripsi   : Berisi program utama class Garis
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 25 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {

        // membuat dua titik
        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);

        // membuat objek garis dari titik A dan B
        Garis G1 = new Garis(A, B);

        // menampilkan titik awal dan akhir
        G1.printGaris();

        // menampilkan panjang garis
        System.out.println("Panjang Garis G1 : " + G1.getPanjang());

        // menampilkan gradien
        System.out.println("Gradien G1 : " + G1.getGradien());

        // menampilkan titik tengah
        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah G1 : ");
        tengah.printTitik();

        // menampilkan persamaan garis
        System.out.println("Persamaan Garis G1 : " + G1.getPersamaanGaris());

        // membuat garis kedua
        Garis G2 = new Garis(new Titik(1,1), new Titik(3,5)); // objek garis baru

        // mengecek apakah sejajar
        System.out.println("Apakah G1 sejajar dengan G2? " + G1.isSejajar(G2));

        // mengecek apakah tegak lurus
        System.out.println("Apakah G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2));

        // menampilkan jumlah objek garis
        System.out.println("Jumlah objek Garis sekarang : " + Garis.getCounterGaris());
    }
}