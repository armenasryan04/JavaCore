package HomeWork11;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String employeeId;
    private String company;
    private String position;
    private double salary;
    private boolean active = true;
    private Date registerDate;
    private Date dateOfBirthDay;

    public Employee(String name, String surname, String employeeId,
                    String company, String position, double salary,
                    Date registerDate, Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
        this.company = company;
        this.position = position;
        this.salary = salary;
        this.dateOfBirthDay = dateOfBirthday;
        this.registerDate = registerDate;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(Date dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && active == employee.active && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(employeeId, employee.employeeId) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position) && Objects.equals(registerDate, employee.registerDate) && Objects.equals(dateOfBirthDay, employee.dateOfBirthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeId, company, position, salary, active, registerDate, dateOfBirthDay);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", active=" + active +
                ", registerDate=" + registerDate +
                ", dateOfBirthDay=" + dateOfBirthDay +
                '}';
    }
}




