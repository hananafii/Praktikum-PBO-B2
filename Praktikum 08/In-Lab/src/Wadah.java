/* Nama File   : Wadah.java
 * Deskripsi   : Class generic sebagai wadah penyimpanan nilai
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 April 2026
 */

public class Wadah<T> {

    // atribut generic
    T nilai;

    // konstruktor
    public Wadah(T nilai) {
        this.nilai = nilai;
    }
}