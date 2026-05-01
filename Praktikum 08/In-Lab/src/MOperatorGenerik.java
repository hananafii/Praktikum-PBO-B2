/* Nama File   : MOperatorGenerik.java
 * Deskripsi   : Program utama OperatorGenerik
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 April 2026
 */

public class MOperatorGenerik {
    public static void main(String[] args) {

        // Kamus
        Wadah<Integer> angka1;
        Wadah<Integer> angka2;

        Wadah<String> teks1;
        Wadah<String> teks2;

        Wadah<Anabul> hewan1;
        Wadah<Anabul> hewan2;

        Anggora a;
        Kembangtelon k;

        // Algoritma
        // Membuat integer
        angka1 = new Wadah<>(3);
        angka2 = new Wadah<>(6);

        // Menampilkan isi sebelum ditukar
        System.out.println("Angka sebelum tukar");
        System.out.println(angka1.nilai + " " + angka2.nilai);

        // Menukar integer
        OperatorGenerik.Tukar(angka1, angka2);

        // Menampilkan isi setelah ditukar
        System.out.println("Angka sesudah tukar");
        System.out.println(angka1.nilai + " " + angka2.nilai);

        // Membuat string
        teks1 = new Wadah<>("Hana");
        teks2 = new Wadah<>("Nafi");

        // Menampilkan isi sebelum ditukar
        System.out.println("\nString sebelum tukar");
        System.out.println(teks1.nilai + " " + teks2.nilai);

        // Menukar string
        OperatorGenerik.Tukar(teks1, teks2);

        // Menampilkan hasil pertukaran string
        System.out.println("String setelah tukar");
        System.out.println(teks1.nilai + " " + teks2.nilai);

        // Membuat objek Anabul
        hewan1 = new Wadah<>(new Anjing());
        hewan2 = new Wadah<>(new Kucing(4));

        // Menampilkan isi sebelum ditukar
        System.out.println("\nAnabul sebelum tukar");
        hewan1.nilai.suara();
        hewan2.nilai.suara();

        // Menukar objek Anabul
        OperatorGenerik.Tukar(hewan1, hewan2);

        // Menampilkan suara hewan setelah ditukar
        System.out.println("Anabul setelah tukar");
        hewan1.nilai.suara();
        hewan2.nilai.suara();

        // Membuat objek Anggora dan Kembangtelon
        a = new Anggora(4.5);
        k = new Kembangtelon(5.5);

        // Menampilkan total bobot
        System.out.println("\nTotal Bobot");
        System.out.println(
            OperatorGenerik.Bobot2(a, k)
        );
    }
}