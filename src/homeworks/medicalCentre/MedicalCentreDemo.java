package homeworks.medicalCentre;


import com.sun.xml.internal.bind.v2.model.core.ID;
import homeworks.medicalCentre.Professions.Professions;
import homeworks.medicalCentre.model.Doctor;
import homeworks.medicalCentre.model.Patient;
import homeworks.medicalCentre.storage.PersonStorage;
import homeworks.medicalCentre.utill.DateUtill;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCentreDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException, IllegalArgumentException {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            try {
                String command = scanner.nextLine();
                switch (command) {
                    case EXIT:
                        isRun = false;
                        break;
                    case ADD_DOCTOR:
                        addDoctor();
                        break;
                    case SEARCH_DOCTOR_BY_PROFESSION:
                        System.out.println("please input profession");
                        String profession = scanner.nextLine();
                        personStorage.searchDoctorByProfession(Professions.valueOf(profession));
                        break;
                    case DELETE_DOCTOR_BY_ID:
                        String ID = scanner.nextLine();
                        personStorage.deleteDoctorByID(ID);
                        break;
                    case CHANGE_DOCTOR_DATA_BY_ID:
                        System.out.println("please input ID");
                        ID = scanner.nextLine();
                        System.out.println(personStorage.getDoctorByID(ID));
                        changeDoctorData(ID);
                        break;
                    case ADD_PATIENT:
                        addPatient();
                        break;
                    case PRINT_PATIENT_BY_DOCTOR:
                        System.out.println("Please input doctor ID");
                        ID = scanner.nextLine();
                        personStorage.searchPatientsByDoctor(personStorage.getDoctorByID(ID));
                        break;
                    case PRINT_TODAYS_PATIENTS:
                        personStorage.PrintToDaysPatients();


                }
            } catch (IllegalArgumentException illegalArgumentException) {
                PersonStorage.illegalExceptionFix();
            }

        }

    }


    private static void addPatient() throws ParseException {
        try {
            System.out.println("Please input name");
            String name = scanner.nextLine();
            System.out.println("Please input surname");
            String surname = scanner.nextLine();
            System.out.println("Please input Patient ID");
            String ID = scanner.nextLine();
            System.out.println("Please input phone number");
            String phoneNumber = scanner.nextLine();
            personStorage.printDoctors();
            System.out.println("Please Doctor id ");
            String Id = scanner.nextLine();
            if (personStorage.getDoctorByID(Id) == null) {
                System.out.println("we don't have Doctor with" + Id + "ID please try again");
            } else {
                System.out.println("Please input register date ");
                String registerDate = scanner.nextLine();
                if (personStorage.isDoctorFree(DateUtill.stringToDate(registerDate), personStorage.getDoctorByID(ID))) {

                    if (personStorage.getPatientByID(ID) == null) {
                        Patient patient = new Patient(name, surname, ID, phoneNumber, personStorage.getDoctorByID(Id), DateUtill.stringToDate(registerDate));
                        personStorage.add(patient);
                    } else {
                        System.out.println("we already have Patient with " + ID + " ID" + " please try again");
                    }
                } else {
                    System.out.println("we already have patient at " + "this time! ");
                    System.out.println("please choose other time");
                }
            }
        } catch (ParseException e) {
            System.out.println("Incorrect register time please try again!");
        }

    }

    private static void changeDoctorData(String id) {
        System.out.println("Please input name");
        String newName = scanner.nextLine();
        personStorage.getDoctorByID(id).setName(newName);

        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        personStorage.getDoctorByID(id).setSurname(surname);

        System.out.println("Please input phone number");
        String phone = scanner.nextLine();
        personStorage.getDoctorByID(id).setPhoneNumber(phone);


        System.out.println("Please input email");
        String email = scanner.nextLine();
        personStorage.getDoctorByID(id).setEmail(email);


        System.out.println("please input profession");
        String profession = scanner.nextLine();
        personStorage.getDoctorByID(id).setProfession(profession);
        System.out.println("Data was changed!");


    }


    private static void addDoctor() throws IllegalArgumentException {
        try {
            System.out.println("Please input name");
            String name = scanner.nextLine();
            System.out.println("Please input surname");
            String surname = scanner.nextLine();
            System.out.println("Please input Doctor ID");
            String ID = scanner.nextLine();
            System.out.println("Please input phone number");
            String phoneNumber = scanner.nextLine();
            System.out.println("Please input  email name");
            String email = scanner.nextLine();
            System.out.println("Please input profession");
            String profession = scanner.nextLine();
            if (personStorage.getDoctorByID(ID) == null) {
                Doctor doctor = new Doctor(name, surname, ID, phoneNumber, email, profession);
                personStorage.add(doctor);
                System.out.println("Doctor was added!");
            } else {
                System.out.println("we already have Doctor with " + ID + " ID" + " please try again");
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            PersonStorage.illegalExceptionFix();
        }
    }

}