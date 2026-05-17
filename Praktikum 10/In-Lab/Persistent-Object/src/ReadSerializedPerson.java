/* Nama File   : ReadSerializedPerson.java
 * Deskripsi   : Program untuk serialisasi objek Person
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 13 Mei 2026
 */

import java.io.*;

public class ReadSerializedPerson{
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = "+person.getName());
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}