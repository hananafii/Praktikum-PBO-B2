/* Nama File   : Piaraan.java
 * Deskripsi   : Class koleksi antrean anabul
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 6 Mei 2026
 */

import java.util.*;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    // konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // mengambil jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // menambah anabul ke antrean akhir
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    // mengecek membership
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    // mengambil anabul pertama dalam antrean
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // mengambil anabul pertama sekaligus mengeluarkannya dari antrean
    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll();
        }
        return null;
        
    }

    // menampilkan semua nama anabul
    public void showAnabul() {
        System.out.println("Daftar Anabul:");
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    // menghitung jumlah keluarga kucing dalam list/antrean
    public int countKucing(){
        // Kamus
        int count = 0;

        // Algoritma
        for (Anabul a:Lanabul){
            if (a instanceof Kucing){
                count++;
            }
        }
        return count ;
    }

    // menghitung total bobot kucing dalam antrean
    public double bobotKucing() {
        // Kamus
        double total = 0;

        // Algoritma
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    // menampilkan nama dan jenis objek
    public void showJenisAnabul() {
        System.out.println("Jenis Anabul:");
        for (Anabul a : Lanabul) {
            System.out.println(
                a.getNama() + " : " +
                a.getClass().getName()
            );
        }
    }
}