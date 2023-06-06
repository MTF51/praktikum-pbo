/*
* Nama File    : Person.java
* Nama Pembuat : Mustafa Iswardana
* NIM          : 24060121149117
* Deskripsi    : File Kelas Person (Model)
* Tanggal      : 05/06/2023
*/


public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
