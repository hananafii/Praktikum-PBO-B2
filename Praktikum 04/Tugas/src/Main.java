/* Nama File  : Main.java
 * Deskripsi  : program utama untuk menguji class Pegawai, Dosen, dan Tendik
 * Pembuat    : Hana Nafi'atul Haq
 * Tanggal    : 11 Maret 2026
 */

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Dosen Tetap
        DosenTetap d1 = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika"
        );
        d1.printInfo();
        System.out.println("\n");

        // Dosen Tamu
        DosenTamu d2 = new DosenTamu(
                "8745647345",
                "56748392",
                "Budi",
                LocalDate.of(1985,7,12),
                LocalDate.of(2020,3,1),
                4500000,
                "Fakultas Teknik",
                LocalDate.of(2027,3,1)
        );
        d2.printInfo();
        System.out.println("\n");

        // Tendik
        Tendik t1 = new Tendik(
                "7756432456",
                "Siti",
                LocalDate.of(1992,9,10),
                LocalDate.of(2018,2,1),
                3500000,
                "Akademik"
        );
        t1.printInfo();
        System.out.println("\n");

        // Dosen Tetap
        DosenTetap d3 = new DosenTetap(
                "8876543234",
                "44556677",
                "Rina",
                LocalDate.of(1988,3,20),
                LocalDate.of(2012,8,1),
                6000000,
                "Fakultas Ekonomika dan Bisnis"
        );
        d3.printInfo();

    }
}