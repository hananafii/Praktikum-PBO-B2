/* Nama File  : LambdaMap.java
 * Deskripsi  : Menampilkan key dan value Map menggunakan ekspresi lambda
 * Pembuat    : Hana Nafi'atul Haq
 * Tanggal    : 03 Juni 2026
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Kamus
        Map<String, String> mahasiswa;

        // Algoritma
        mahasiswa = new HashMap<>();

        mahasiswa.put("24060124120001", "Hana");
        mahasiswa.put("24060124120001", "Nafi");
        mahasiswa.put("24060124120001", "Atul");
        mahasiswa.put("24060124120004", "Haq");
        mahasiswa.forEach((nim, nama) -> 
                System.out.println(
                    "NIM  : " + nim +
                    "\nNama : " + nama +
                    "\n" 
                )
        );
    }
}