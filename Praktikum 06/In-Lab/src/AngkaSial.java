/* Nama File   : AngkaSial.java
 * Deskripsi   : Program penggunaan exceptioin buatan sendiri
                 Pengenalan klausa 'throw' dan 'throws'
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 25 Maret 2026
 */

/*
    QUESTIONS
    Ketika eksepsi terjadi, apakah baris 12 dieksekusi?
    Apakah baris 21 dieksekusi?

    ANSWER
    Baris 12 sesuai modul --> System.out.println(angka + " bukan angka sial");
    tidak dieksekusi saat terjadi exception karena ketika
    cobaAngka(13) dipanggil, kondisi (angka == 13) terpenuhi dan
    perintah throw dijalankan, jadi program langsung keluar dari method
    cobaAngka dan tidak lanjut ke perintah baris 12.

    Setelah exception terjadi, program juga tidak melanjutkan perintah
    berikutnya di dalam blok try (termasuk cobaAngka(12)), tetapi langsung
    masuk ke blok catch.

    Baris 21 sesuai modul --> catch(AngkaSialException ase)
    dieksekusi karena merupakan bagian awal dari blok catch
    yang memang akan dijalankan saat exception terjadi. 
    Perintah yang ada di dalam catch kemudian dijalankan
    untuk menangani exception tersebut.
*/

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* 
    COMPILE & RUN
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac AngkaSialException.java
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac Angkasial.java
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> java AngkaSial
    10 bukan angka sial
    jangan memasukkan angka 13 karena angka sial!!!
    hati-hati memasukkan angka!!!
*/