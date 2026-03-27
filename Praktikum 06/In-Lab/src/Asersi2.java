/* Nama File   : Asersi2.java
 * Deskripsi   : Program untuk demo asersi, yang akan menolak input 
                 jari-jari lingkaran yang bernilai nol
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 25 Maret 2026
 */

/*
    QUESTIONS
    Secara konsep, ada yang kurang tepat pada program Asersi2. Jelaskan!

    ANSWER
    Penggunaan assert untuk memeriksa input jari-jari kurang tepat karena assert digunakan 
    untuk debugging, bukan untuk validasi input. Validasi input seharusnya menggunakan 
    exception seperti IllegalArgumentException.
*/

//class Lingkaran
class Lingkaran{
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        
        double jariJari = 0;
        assert(jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

/* 
    COMPILE & RUN
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> javac Asersi2.java
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> java Asersi2
    keliling lingkaran = 0.0
    PS C:\UNDIP\semester 4\Praktikum\Praktikum PBO B2\Praktikum 06\In-Lab\src> java -enableassertions Asersi2
    Exception in thread "main" java.lang.AssertionError: jari jari tidak boleh nol!!!
        at Asersi2.main(Asersi2.java:38)
*/