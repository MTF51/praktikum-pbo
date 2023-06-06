/*
* Nama File    : DAOManager.java
* Nama Pembuat : Mustafa Iswardana
* NIM          : 24060121149117
* Deskripsi    : File kelas DAOManager
* Tanggal      : 04/06/2023
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}