package homeworks.medicalCentre;

public interface Commands {
    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_DATA_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_PATIENT_BY_DOCTOR = "6";
    String PRINT_TODAYS_PATIENTS = "7";

    static void printCommands() {
        System.out.println("Please input:" + EXIT + " for end of work ");
        System.out.println("Please input:" + ADD_DOCTOR + " for add Doctor ");
        System.out.println("Please input:" + SEARCH_DOCTOR_BY_PROFESSION + " for search Doctor by profession");
        System.out.println("Please input:" + DELETE_DOCTOR_BY_ID + " for delete Doctor by id");
        System.out.println("Please input:" + CHANGE_DOCTOR_DATA_BY_ID + " for change doctor data");
        System.out.println("Please input:" + ADD_PATIENT + " for add patient ");
        System.out.println("Please input:" + PRINT_PATIENT_BY_DOCTOR + " for print Doctor's patients");
        System.out.println("Please input:" + PRINT_TODAYS_PATIENTS + "for print today's patients ");
    }
}
