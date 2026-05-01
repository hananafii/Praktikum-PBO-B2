/* Nama File   : OperatorGenerik.java
 * Deskripsi   : Class operator generic
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 29 April 2026
 */

public class OperatorGenerik {

    // Prosedur generik Tukar
    public static <T> void Tukar(Wadah<T> a, Wadah<T> b) {
        T temp = a.nilai;
        a.nilai = b.nilai;
        b.nilai = temp;
    }

    // Fungsi generik Bobot2
    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}