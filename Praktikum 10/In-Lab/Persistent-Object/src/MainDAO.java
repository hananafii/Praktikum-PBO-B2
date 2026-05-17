/* Nama File   : MainDAO.java
 * Deskripsi   : Main program untuk akses DAO
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 13 Mei 2026
 */

public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO (new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
