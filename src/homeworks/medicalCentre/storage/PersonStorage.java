package homeworks.medicalCentre.storage;

import homeworks.medicalCentre.Professions.Professions;
import homeworks.medicalCentre.model.Doctor;
import homeworks.medicalCentre.model.Patient;
import homeworks.medicalCentre.model.Person;
import homeworks.medicalCentre.utill.DateUtill;

import java.util.Date;

public class PersonStorage {
    private Person[] persons = new Person[10];
    private int size = 0;

    public void add(Person person) {
        if (size == persons.length) {
            extend();
        }
        persons[size] = person;
        size++;
        System.out.println();
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                System.out.println(persons[i]);
            }

        }

    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                System.out.println(persons[i]);
            }
        }

    }

    public void printPatientsByDocTor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient && ((Patient) persons[i]).getDoctor().equals(doctor)) {
                System.out.println(persons[i]);
            }
        }

    }

    public void searchDoctorByProfession(Professions profession) throws IllegalArgumentException {
      try {
          for (int i = 0; i < size; i++) {
              if (persons[i] instanceof Doctor && ((Doctor) persons[i]).getProfession().equals(profession)) {
                  System.out.println(persons[i]);
              }
          }
      } catch (IllegalArgumentException illegalArgumentException){
          Professions[] professions = Professions.values();
          for ( Professions profession1 : professions) {
              System.out.println(profession1);
          }
          System.out.println("please choose true profession");

      }
    }

    public void deleteDoctorByID(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && persons[i].getId().equals(id)) {
                deleteByIndex(i);
                System.out.println("Doctor with id " + id + " was deleted!");
            }

        }
    }

    public Doctor getDoctorByID(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && persons[i].getId().equals(id)) {
                return (Doctor) persons[i];
            }
        }
        return null;
    }

    public Patient getPatientByID(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient && persons[i].getId().equals(id)) {
                return (Patient) persons[i];
            }
        }
        return null;
    }

    public void searchPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient && ((Patient) persons[i]).getDoctor().equals(doctor)) {
                System.out.println(persons[i]);
            }
        }
    }

    public void PrintToDaysPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient && DateUtill.isSameDay(((Patient) persons[i]).getRegisterDate(), today)) {
                System.out.println(persons[i]);
            }
        }
    }

    private void extend() {
        Person[] newArray = new Person[persons.length + 10];
        System.arraycopy(persons, 0, newArray, 0, persons.length);
        persons = newArray;
    }

    private void deleteByIndex(int i) {
        for (int j = i + 1; j < size; j++) {
            persons[j - 1] = persons[j];
        }
        size--;
    }

    public boolean isDoctorFree(Date regTime, Doctor doctor) {
        for (int i = 0; i < size; i++){
            if (persons[i] instanceof Patient){
                Patient patient =(Patient) persons[i];
                if (patient.getDoctor().equals(doctor) && patient.getRegisterDate().equals(regTime)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void illegalExceptionFix(){
        Professions[] professions = Professions.values();
        for ( Professions profession1 : professions) {
            System.out.println(profession1);
        }
        System.out.println("please choose true profession");

    }
    }


