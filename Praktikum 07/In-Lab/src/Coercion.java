/* Nama File   : Coercion.java
 * Deskripsi   : Program untuk menunjukkan polimorfisme ad hoc coercion
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 22 Maret 2026
 */

public class Coercion {
    public static void main(String[] args) {
        // nilai awal bertipe integer
        int nilai = 65;

        // nilai int
        System.out.println("Nilai   : " + nilai);

        // nilai int -> char
        char c = (char) nilai;
        System.out.println("Char    : " + c);

        // nilai int -> double
        double d = (double) nilai;
        System.out.println("Double  : " + d);

        // nilai double -> int
        int i = (int) d;
        System.out.println("Integer : " + i);

        System.out.println();
        // String awal X dan Y
        String X = "1234";
        String Y = "5678";

        // konkatenasi X dan Y
        String S = X + Y;
        System.out.println("Konkatenasi S: " + S);

        // string -> int lalu dijumlahkan
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Penjumlahan Z: " + Z);

        System.out.println();
        // String awal P dan Q
        String P = "12.34";
        String Q = "56.78";

        // konkatenasi P dan Q
        String R = P + Q;
        System.out.println("Konkatenasi R: " + R);

        // string -> double lalu dijumlahkan
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Penjumlahan D: " + D);

        System.out.println();
        // String -> int
        // S = "12345678"
        Integer A = Integer.parseInt(S); 
        System.out.println("Nilai A: " + A);

        // int -> String
        String T = A.toString();
        System.out.println("Nilai T: " + T);
    }
}