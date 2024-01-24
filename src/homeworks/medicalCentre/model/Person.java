package homeworks.medicalCentre.model;

import java.util.Objects;

public abstract class Person {
    private String name;
    private String surname;
    private String id;
    private String phoneNumber;


    public Person(String name, String surname, String id, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(id, person.id) && Objects.equals(phoneNumber, person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, phoneNumber);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ',';
    }
}
