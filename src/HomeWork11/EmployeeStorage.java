package HomeWork11;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }
    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchEmployeeByCompanyName(String companyName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(companyName)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchEmployeeBySalaryRange(double maxPrice, double minPrice) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= minPrice && employee.getSalary() <= maxPrice) {
                System.out.println(employee);
            }
        }
    }

    public void printByStatus(boolean isActive) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == isActive) {

                System.out.println(employees[i]);
            }
        }
    }
}

