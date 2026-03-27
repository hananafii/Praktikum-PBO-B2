/* Nama File   : Asersi1.java
 * Deskripsi   : Program untuk menunjukkan asersi
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 25 Maret 2026
 */

public class Asersi1 {
    public static void main(String[] args){
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

/* 
    COMPILE & RUN 
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac Asersi1.java                                                                                   
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> java Asersi1 
    x bilangan negatif                                                                      
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> java -enableassertions Asersi1
    Exception in thread "main" java.lang.AssertionError: ada kesalahan kode
        at Asersi1.main(Asersi1.java:13)
*/