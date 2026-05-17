/* Nama File   : DAOManager.java
 * Deskripsi   : Pengelola DAO dalam program
 * Pembuat     : Hana Nafi'atul Haq
 * Tanggal     : 13 Mei 2026
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
