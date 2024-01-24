package homeworks.employee.storage;

import homeworks.employee.model.Employee;

public class EmployeeStorage {
    private Employee[] employee = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == employee.length) {
            extend();
        }
        employee[size] = value;
        size++;
        System.out.println();
    }

    private void extend() {
        Employee[] newArray = new Employee[employee.length + 10];

        for (int i = 0; i < employee.length; i++) {
            newArray[i] = employee[i];
        }
        employee = newArray;
    }

    public void print() {
        if (size == 0) {
            System.out.println("we don't have employee ");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(employee[i]);

            }
        }
    }
    public void PrintActiveEmployees() {
        if (size == 0) {
            System.out.println("we don't have employee ");
        } else {
            for (int i = 0; i < size; i++) {
                if (employee[i].isActive()) {
                    System.out.println(employee[i]);
                }else {
                    System.out.println("we don't have active employee ");
                }

            }

        }
    }

    public void searchByCompany(String companyName) {
        int isHave = 0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getCompany().contains(companyName.toLowerCase())) {
                System.out.println(employee[i]);
                isHave++;
            }
            if (isHave == 0) {
                System.out.println("we don't have employee who is work in " + companyName + "company");
                break;
            }
        }
    }

    public Employee getById(String id) {
        for (int i = 0; i < size; i++) {
            if (employee[i].getEmployeeID().equals(id)) {
                return employee[i];
            }
        }
        return null;
    }

    public void searchBySalaryRange(int min, int max) {
        if (size == 0) {
            System.out.println("we don't have employee ");
        } else {
            for (int i = 0; i < size; i++) {
                int isHave = 0;
                if (employee[i].getSalary() >= min && employee[i].getSalary() <= max) {
                    System.out.println(employee[i]);
                    isHave++;
                }
                if (isHave == 0) {
                    System.out.println("we do not have an employee with such a salary");
                    break;
                }
            }
        }
    }
}



