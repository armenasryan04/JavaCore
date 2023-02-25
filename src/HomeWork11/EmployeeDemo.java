package HomeWork11;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    public static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        while (isRun) {
            System.out.println("PLease input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print employees");
            System.out.println("Please input 3 for search employee by Id");
            System.out.println("Please input 4 for search employee by company name");
            System.out.println("Please input 5 for search employee by salary  range");
            System.out.println("Please input 6 for change position");
            System.out.println("Please input 7 for print only active employees");
            System.out.println("Please input 8 for inactive employee by Id");
            System.out.println("Please input 9 for activate employee by Id");
            String command = scanner.nextLine();
            switch (command) {
                case "0" -> isRun = false;
                case "1" -> addEmployee();
                case "2" -> employeeStorage.print();
                case "3" -> searchByEmployeeId();
                case "4" -> {
                    System.out.println("Please input company name for search employee");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(companyName);
                }
                case "5" -> searchBySalaryRange();
                case "6" -> changeEmployeePosition();
                case "7" -> employeeStorage.printByStatus(true);
                case "8" -> inactiveEmployee();
                case "9" -> activateEmployee();
                default -> {
                    System.out.println("Wrong command!!!");
                    System.out.println("please try again");
                }
            }
        }
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please input employee Id for activate");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("Wrong Id or employee already activated!!! Please try again");
        } else {
            employee.setActive(true);
            System.out.println("Status is changed!");
        }
    }

    private static void inactiveEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please input employee Id for inactivate");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong Id or employee already inactivated!!! Please try again");
        } else {
            employee.setActive(false);
            System.out.println("Status is changed!");
        }
    }

    private static void changeEmployeePosition() {
        employeeStorage.printByStatus(true);
        System.out.println("Please input ID for change position");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Wrong ID!!!  Please input again");
        } else {
            System.out.println("Please input new position");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("position changed!");
        }
    }

    private static void searchBySalaryRange() {
        System.out.println("Please input max and min prices ");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double maxPrice = Double.parseDouble(salaryRange[0]);
        double minPrice = Double.parseDouble(salaryRange[1]);
        employeeStorage.searchEmployeeBySalaryRange(maxPrice, minPrice);
        if (minPrice > maxPrice) {
            System.out.println("wrong range!!!");
            System.out.println("please try again");

        }
    }

    public static void addEmployee() throws ParseException {
        System.out.println("Please input your name,surname,employeeId,company name,position,salary,data of birthday (11/02/2023)");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employeeById = employeeStorage.getEmployeeById(employeeId);
        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeId,
                    employeeData[3], employeeData[4], Double.parseDouble(employeeData[5]), new Date(), DateUtil.stringToDte(employeeData[6]));
            employeeStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.err.println("employee by " + employeeById + "id is already added ");
        }
    }

    private static void searchByEmployeeId() {
        System.out.println("please input Id for search employee ");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee by" + employeeId + "id not does exits!");
        } else {
            System.out.println(employee);
        }
    }
}
