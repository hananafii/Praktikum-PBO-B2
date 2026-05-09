/* Nama File   : Teman.java
 * Deskripsi   : Kelas koleksi teman menggunakan ArrayList
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 6 Mei 2026
 */

import java.util.*;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;

    // konstruktor untuk membuat list teman kosong
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // mengambil jumlah elemen teman
    public int getNbelm() {
        return nbelm;
    }

    // mengambil nama teman berdasarkan indeks
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // mengubah nama teman pada indeks tertentu
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // menambahkan nama teman ke dalam list
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // menghapus nama teman dari list
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    // mengecek apakah nama termasuk anggota teman
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // mengganti nama lama menjadi nama baru
    public void gantiNama(String nama, String namaBaru) {
        // Kamus
        int idx = Lnama.indexOf(nama);

        // Algoritma
        if (idx != -1) {
            Lnama.set(idx, namaBaru);
        }
    }

    // menghitung jumlah kemunculan nama tertentu
    public int countNama(String nama) {
        // Kamus
        int count = 0;
        
        // Algoritma
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // menampilkan seluruh daftar teman
    public void showTeman() {
        System.out.println("Daftar Teman : ");
        for (String nama : Lnama) {
            System.out.println(nama);
        }
    }
}