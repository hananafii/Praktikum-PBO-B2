/* Nama File   : MTitik.java
 * Deskripsi   : Berisi program utama class Titik
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 25 Februari 2026
 */

public class MTitikLengkap {
    public static void main(String[] args) {
        TitikLengkap T1 = new TitikLengkap(); // membuat objek titik T1 (0,0)      
        T1.setAbsis(3); // mengubah absis jadi 3
        T1.setOrdinat(4); // mengubah ordinat jadi 4
        T1.printTitik(); // tampilkan koordinat T1
        T1.geser(3, 4); // geser sejauh (3,4)
        T1.printTitik(); // tampilkan setelah digeser

        TitikLengkap T2 = T1; // membuat objek titik T1 (0,0)    
        T2.printTitik(); // tampilkan koordinat  
        T1.setAbsis(10); // mengubah absis jadi 10
        T1.setOrdinat(10); // mengubah ordinat jadi 10
        T1.printTitik(); // tampilkan koordinat T1
        T2.printTitik(); // tampilkan koordinat T2

        // getter
        System.out.println("Absis T1 : " + T1.getAbsis());
        System.out.println("Ordinat T1 : " + T1.getOrdinat());

        // static counter
        System.out.println("Jumlah objek Titik : " + TitikLengkap.getCounterTitik());

        // menentukan kuadran
        System.out.println("Kuadran T1 : " + T1.getKuadran());

        // jarak ke pusat
        System.out.println("Jarak T1 ke pusat : " + T1.getJarakPusat());

        // membuat objek baru untuk uji jarak
        TitikLengkap T3 = new TitikLengkap(1, 1); // membuat objek titik baru (1,1)
        T3.printTitik();

        // menghitung jarak antara T1 dan T3
        System.out.println("Jarak T1 ke T3 : " + T1.getJarak(T3));

        // refleksi terhadap sumbu X (mengubah objek)
        T3.refleksiX();
        System.out.print("T3 setelah refleksi X : ");
        T3.printTitik();

        // refleksi terhadap sumbu Y (mengubah objek)
        T3.refleksiY();
        System.out.print("T3 setelah refleksi Y : ");
        T3.printTitik();

        // mendapatkan objek baru hasil refleksi X
        TitikLengkap T4 = T1.getRefleksiX();
        System.out.print("Refleksi X dari T1: "); // hasil objek titik baru
        T4.printTitik();

        // mendapatkan objek baru hasil refleksi Y
        TitikLengkap T5 = T1.getRefleksiY();
        System.out.print("Refleksi Y dari T1: "); // hasil objek titik baru
        T5.printTitik();

        // menampilkan kembali jumlah objek setelah penambahan
        System.out.println("Jumlah objek Titik sekarang : " + TitikLengkap.getCounterTitik());
    }
}