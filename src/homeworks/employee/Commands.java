package homeworks.employee;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEES = "2";
    String SEARCH_BY_ID = "3";
    String SEARCH_BY_COMPANY = "4";
    String SEARCH_BY_SALARY_RANGE = "5";
    String CHANGE_POSITION = "6";
    String PRINT_ACTIVE_EMPLOYEES = "7";
    String INACTIVE_EMPLOYEE = "8";
    String ACTIVATE_EMPLOYEE = "9";

    static void printCommands() {
        System.out.println("Please input: " + EXIT + " for end of work");
        System.out.println("Please input: " + ADD_EMPLOYEE + " for add employee");
        System.out.println("Please input: " + PRINT_ALL_EMPLOYEES + " for See dates of employees");
        System.out.println("Please input: " + SEARCH_BY_ID + " for search employee by ID");
        System.out.println("Please input: " + SEARCH_BY_COMPANY + " for search employee by company name");
        System.out.println("Please input: " + SEARCH_BY_SALARY_RANGE + " for search employee by salary range");
        System.out.println("Please input: " + CHANGE_POSITION + " for change employee position by id");
        System.out.println("please input: " + PRINT_ACTIVE_EMPLOYEES + " for see dates of only active employees");
        System.out.println("Please input: " + INACTIVE_EMPLOYEE + " for inactive employee by id");
        System.out.println("Please input: " + ACTIVATE_EMPLOYEE + " for activate employee by id");
    }
}
