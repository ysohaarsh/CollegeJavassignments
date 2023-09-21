import java.util.ArrayList;

class Employee {
    protected String name;
    protected int employeeId;
    protected String department;
    protected String position;
    protected double salary;
    
    public Employee(String name, int employeeId, String department, String position, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}

class Attendance extends Employee {
    protected int sickDays;
    protected int vacationDays;
    protected int absences;
    
    public Attendance(String name, int employeeId, String department, String position, double salary,
            int sickDays, int vacationDays, int absences) {
        super(name, employeeId, department, position, salary);
        this.sickDays = sickDays;
        this.vacationDays = vacationDays;
        this.absences = absences;
    }
    
    public void displayAttendance() {
        System.out.println("Sick Days: " + sickDays);
        System.out.println("Vacation Days: " + vacationDays);
        System.out.println("Absences: " + absences);
    }
}

class HRSystem extends Attendance {
    ArrayList<Attendance> employees = new ArrayList<>();
    
    public HRSystem(String name, int employeeId, String department, String position, double salary,
            int sickDays, int vacationDays, int absences) {
        super(name, employeeId, department, position, salary, sickDays, vacationDays, absences);
    }
    
    public void addEmployee(Attendance employee) {
        employees.add(employee);
        System.out.println("Employee added.");
    }
    
    public void updateEmployee(int index, Attendance updatedEmployee) {
        employees.set(index, updatedEmployee);
        System.out.println("Employee updated.");
    }
    
    public void generateReport() {
        System.out.println("Employee data report:");
        for (Attendance employee : employees) {
            employee.displayDetails();
            employee.displayAttendance();
            System.out.println();
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        HRSystem hrSystem = new HRSystem("John Doe", 1, "HR", "Manager", 5000, 2, 5, 3);
        Attendance employee1 = new Attendance("Alice Smith", 2, "IT", "Developer", 4000, 0, 10, 1);
        Attendance employee2 = new Attendance("Bob Johnson", 3, "Sales", "Representative", 3000, 1, 7, 2);
        
        hrSystem.addEmployee(employee1);
        hrSystem.addEmployee(employee2);
        hrSystem.generateReport();
        
        Attendance updatedEmployee1 = new Attendance("Alice Smith", 2, "IT", "Manager", 5000, 0, 10, 1);
        hrSystem.updateEmployee(0, updatedEmployee1);
        hrSystem.generateReport();
    }
}
