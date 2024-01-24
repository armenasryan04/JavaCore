package homeworks.medicalCentre.model;

import homeworks.medicalCentre.utill.DateUtill;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {
    Doctor doctor;
    Date registerDate;

    public Patient(String name, String surname, String id, String phoneNumber, Doctor doctor, Date registerDate) {
        super(name, surname, id, phoneNumber);
        this.doctor = doctor;
        this.registerDate = registerDate;
    }

    public Patient(Doctor doctor, Date registerDate) {
        this.doctor = doctor;
        this.registerDate = registerDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(registerDate, patient.registerDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, registerDate);
    }

    @Override
    public String toString() {
        return "Patient data's"
                + doctor + super.toString() +
                ", registerDate=" + DateUtill.dateToString(registerDate) +
                '}';
    }
}
