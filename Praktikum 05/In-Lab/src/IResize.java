/* Nama File   : IResize.java
 * Deskripsi   : interface untuk resize bangun datar
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 18 Maret 2026
 */

public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih keci;
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan 
    public void zoom(int percent);
}