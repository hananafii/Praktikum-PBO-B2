/* Nama File   : Data.java
 * Deskripsi   : Class generic Data
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 April 2026
 */

public class Data<T> {
    private T[] ruang; 
    private int banyak; 

    // konstruktor
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    // mengembalikan isi pada sebuah posisi
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return ruang[posisi - 1];
        }
        return null;
    }

    // mengisi data pada sebuah posisi
    public void setIsi(int posisi, T isi) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = isi;
            if (posisi > banyak) {
                banyak = posisi;
            }
        }
    }

    // mengembalikan jumlah elemen
    public int getSize() {
        return banyak;
    }
}