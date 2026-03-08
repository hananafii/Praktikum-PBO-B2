/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 19 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // membuat objek titik T1 (0,0)      
        T1.setAbsis(3); // mengubah absis jadi 3
        T1.setOrdinat(4); // mengubah ordinat jadi 4
        T1.printTitik(); // tampilkan koordinat T1
        T1.geser(3, 4); // geser sejauh (3,4)
        T1.printTitik(); // tampilkan setelah digeser
    }
}