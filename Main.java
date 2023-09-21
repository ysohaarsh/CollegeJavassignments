import java.util.Scanner;
class Employee {
    String name;
    int empId;
    String address;
    String mailId;
    String mobileNo;

    public Employee(String name, int empId, String address, String mailId, String mobileNo) {
        this.name = name;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }
}

class Programmer extends Employee {
    double basicPay;

    public Programmer(String name, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(name, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public double calculateGrossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.1 * basicPay;
        return basicPay + da + hra;
    }

    public double calculateNetSalary() {
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return calculateGrossSalary() - pf - staffClubFund;
    }
}

class AsstProfessor extends Employee {
    double basicPay;

    public AsstProfessor(String name, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(name, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public double calculateGrossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.1 * basicPay;
        return basicPay + da + hra;
    }

    public double calculateNetSalary() {
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return calculateGrossSalary() - pf - staffClubFund;
    }
}

class AssociateProfessor extends Employee {
    double basicPay;

    public AssociateProfessor(String name, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(name, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public double calculateGrossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.1 * basicPay;
        return basicPay + da + hra;
    }

    public double calculateNetSalary() {
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return calculateGrossSalary() - pf - staffClubFund;
    }
}


class Professor extends Employee {
    double basicPay;

    public Professor(String name, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(name, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public double calculateGrossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.1 * basicPay;
        return basicPay + da + hra;
    }

    public double calculateNetSalary() {
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return calculateGrossSalary() - pf - staffClubFund;
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Programmer programmer = new Programmer("John", 1, "123 Main St", "john@example.com", "555-1234", 5000);
//         AsstProfessor asstProfessor = new AsstProfessor("Jane", 2, "456 Elm St", "jane@example.com", "555-5678", 6000);
//         AssociateProfessor associateProfessor = new AssociateProfessor("Bob", 3, "789 Oak St", "bob@example.com", "555-9012", 7000);
//         Professor professor = new Professor("Alice", 4, "321 Pine St", "alice@example.com", "555-3456", 8000);

//         System.out.println("Programmer: " + programmer.name);
//         System.out.println("Gross Salary: " + programmer.calculateGrossSalary());
//         System.out.println("Net Salary: " + programmer.calculateNetSalary());

//         System.out.println("Assistant Professor: " + asstProfessor.name);
//         System.out.println("Gross Salary: " + asstProfessor.calculateGrossSalary());
//         System.out.println("Net Salary: " + asstProfessor.calculateNetSalary());

//         System.out.println("Associate Professor: " + associateProfessor.name);
//         System.out.println("Gross Salary: " + associateProfessor.calculateGrossSalary());
//         System.out.println("Net Salary: " + associateProfessor.calculateNetSalary());

//         System.out.println("Professor: " + professor.name);
//         System.out.println("Gross Salary: " + professor.calculateGrossSalary());
//         System.out.println("Net Salary: " + professor.calculateNetSalary());
//     }
// }

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee category (Programmer/AsstProfessor/AssociateProfessor/Professor): ");
        String category = scanner.nextLine();

        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.println("Enter employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter employee address: ");
        String address = scanner.nextLine();

        System.out.println("Enter employee mail ID: ");
        String mailId = scanner.nextLine();

        System.out.println("Enter employee mobile number: ");
        String mobileNo = scanner.nextLine();

        System.out.println("Enter employee basic pay: ");
        double basicPay = scanner.nextDouble();

        scanner.close();

        Employee employee;

        switch (category) {
            case "Programmer":
                employee = new Programmer(name, empId, address, mailId, mobileNo, basicPay);
                break;
            case "AsstProfessor":
                employee = new AsstProfessor(name, empId, address, mailId, mobileNo, basicPay);
                break;
            case "AssociateProfessor":
                employee = new AssociateProfessor(name, empId, address, mailId, mobileNo, basicPay);
                break;
            case "Professor":
                employee = new Professor(name, empId, address, mailId, mobileNo, basicPay);
                break;
            default:
                System.out.println("Invalid category");
                return;
        }

        System.out.println(category + ": " + employee.name);
        System.out.println("Gross Salary: " + ((Programmer)employee).calculateGrossSalary());
        System.out.println("Net Salary: " + ((Programmer)employee).calculateNetSalary());
    }
}
