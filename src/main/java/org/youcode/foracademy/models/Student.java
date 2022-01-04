package org.youcode.foracademy.models;

public class Student extends User{
    private Class aclass;
    private Specialiter specialiter;

    public Student(Class aclass, Specialiter specialiter) {
        this.aclass = aclass;
        this.specialiter = specialiter;
    }

    public Student(long id_user, String first_name, String last_name, String email, String password, long phone, String gander, boolean status_compte, Role role, Adress adress, Fabrique fabrique, Class aclass, Specialiter specialiter) {
        super(id_user, first_name, last_name, email, password, phone, gander, status_compte, role, adress, fabrique);
        this.aclass = aclass;
        this.specialiter = specialiter;
    }

    public Class getAclass() {
        return aclass;
    }

    public void setAclass(Class aclass) {
        this.aclass = aclass;
    }

    public Specialiter getSpecialiter() {
        return specialiter;
    }

    public void setSpecialiter(Specialiter specialiter) {
        this.specialiter = specialiter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "aclass=" + aclass +
                ", specialiter=" + specialiter +
                '}';
    }
}
