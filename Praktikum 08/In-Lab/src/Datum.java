/* Nama File   : Datum.java
 * Deskripsi   : Class generic Datum
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 April 2026
 */

public class Datum<T> {
    private T isi; 

    // konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }

    // mengembalikan isi datum
    public T getIsi() {
        return isi;
    }

    // mengeset isi datum
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}