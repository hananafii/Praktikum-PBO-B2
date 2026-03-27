/* Nama File   : ExceptionOnArray.java
 * Deskripsi   : Program penggunaan eksepsi menggunakan class library Java
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 25 Maret 2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}

/*
    COMPILE & RUN
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac ExceptionOnArray.java
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> java ExceptionOnArray
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
            at ExceptionOnArray.main(ExceptionOnArray.java:14)
    clean up code...
 */