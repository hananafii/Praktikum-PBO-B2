/* Nama File   : MManusia.java
 * Deskripsi   : main class untuk menjalankan program Manusia
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        // membuat objek
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006,4,1), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000,1,1), "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977,1,9), "Jl. Bunga", 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010,4,1), "", 10000000, "198004212010041002");

        // mengubah alamat
        p2.setAlamat("Jl. Panorama 111");

        // menampilkan jumlah objek
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        // menampilkan pajak
        System.out.println("\nPajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        // menampilkan masa kerja
        System.out.println("\nMasa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        // menampilkan informasi lengkap
        System.out.println("\nINFO");
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}