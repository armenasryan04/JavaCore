package homeworks.employee;

import homeworks.employee.model.Employee;
import homeworks.employee.storage.EmployeeStorage;
import homeworks.employee.utill.DateUtill;

import java.text.ParseException;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRUN = true;
        while (isRUN) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRUN = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_BY_ID:
                    searchByID();
                    break;
                case SEARCH_BY_COMPANY:
                    searchByCompany();
                    break;
                case SEARCH_BY_SALARY_RANGE:
                    searchEmployeeBySalaryRange();
                    break;
                case CHANGE_POSITION:
                    changePositionByID();
                    break;
                case PRINT_ACTIVE_EMPLOYEES:
                    employeeStorage.PrintActiveEmployees();
                    break;
                case INACTIVE_EMPLOYEE:
                    inactiveByID();
                    break;
                case ACTIVATE_EMPLOYEE:
                    activateByID();
                default:
                    System.out.println("Please input true index");
                    break;
            }
        }
    }

    private static void activateByID() {
        System.out.println("Please input employee ID");
        String id = scanner.nextLine();
        if (employeeStorage.getById(id).isActive()){
            System.out.println("Employee with " + id + " id is already active!");
        }else {
            employeeStorage.getById(id).setActive(true);
            System.out.println("employee is activated");
        }
    }

    private static void inactiveByID() {
        System.out.println("Please input employee ID");
        String id = scanner.nextLine();
       if (employeeStorage.getById(id).isActive()){
           employeeStorage.getById(id).setActive(false);
           System.out.println("employee is inactivated!");
       }else {
           System.out.println("Employee with " + id + " id is already inactivate!");
       }

    }

    private static void changePositionByID() {
        System.out.println("Please input Employee ID for change position");
        String id = scanner.nextLine();
        System.out.println("Please input new position");
        String newPosition = scanner.nextLine();
        employeeStorage.getById(id).setPosition(newPosition);
        System.out.println("Employee position is changed!");
    }

    private static void searchByID() {
        System.out.println("Please input ID");
        String id = scanner.nextLine();
        if (employeeStorage.getById(id)==null){
            System.out.println("we don't have employee with " + id + " ID");
        }else {
            System.out.println(employeeStorage.getById(id));
        }
    }

    private static void searchByCompany() {
        System.out.println("Please input company name");
        String companyName = scanner.nextLine();
        employeeStorage.searchByCompany(companyName);
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("please input employee's min salary");
        String min = scanner.nextLine();
        System.out.println("please input employee's max salary");
        String max = scanner.nextLine();
        if (Integer.parseInt(min) > Integer.parseInt(max)) {
            System.out.println("min price  > max ");
        } else {
            employeeStorage.searchBySalaryRange(Integer.parseInt(min), Integer.parseInt(max));
        }
    }

    public static void addEmployee() throws ParseException {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        System.out.println("Please input employee ID");
        String employeeID = scanner.nextLine();
        System.out.println("Please input salary");
        String salary = scanner.nextLine();
        System.out.println("Please input  company name");
        String company = scanner.nextLine();
        System.out.println("Please input position");
        String position = scanner.nextLine();
        System.out.println("Please input date of Birthday (26/06/1995)");
        String dateOfBirthday = scanner.nextLine();
        if (employeeStorage.getById(employeeID) == null) {
            Employee employee = new Employee(name, surname, employeeID, Integer.parseInt(salary), company, position, DateUtill.stringToDate(dateOfBirthday));
            employeeStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("you already have employee with " + employeeID + " ID" + " please try again");
        }
    }
}
