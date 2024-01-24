package homeworks.medicalCentre.model;

import homeworks.medicalCentre.Professions.Professions;

import java.util.Objects;

public class Doctor extends Person {

    private String email;
    private Professions profession;

    public Doctor(String name, String surname, String id, String phoneNumber, String email, String profession) {
        super(name, surname, id, phoneNumber);
        this.email = email;
        this.profession = Professions.valueOf(profession);
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Professions getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = Professions.valueOf(profession);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && Objects.equals(profession, doctor.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession);
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString() +
                "email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
