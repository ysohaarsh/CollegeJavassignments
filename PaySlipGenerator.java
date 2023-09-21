class Employee {
    protected String name;
    protected String empId;
    protected String address;
    protected String mailId;
    protected String mobileNo;
    protected double basicPay;
    Employee(String name, String empId, String address, String mailId, String mobileNo, double 
   basicPay) {
    this.name = name;
    this.empId = empId;
    this.address = address;
    this.mailId = mailId;
    this.mobileNo = mobileNo;
    this.basicPay = basicPay;
    }
    void generatePaySlip() {
    double da = 0.97 * basicPay;
    double hra = 0.1 * basicPay;
    double pf = 0.12 * basicPay;
    double staffClubFund = 0.001 * basicPay;
    double grossSalary = basicPay + da + hra;
    double netSalary = grossSalary - pf - staffClubFund;
    System.out.println("\n\n Name: " + name);
    System.out.println("Emp ID: " + empId);
    System.out.println("Address: " + address);
    System.out.println("Mail ID: " + mailId);
    System.out.println("Mobile No: " + mobileNo);
    System.out.println("Basic Pay: " + basicPay);
    System.out.println("DA: " + da);
    System.out.println("HRA: " + hra);
    System.out.println("PF: " + pf);
    System.out.println("Staff Club Fund: " + staffClubFund);
    System.out.println("Gross Salary: " + grossSalary);
    System.out.println("Net Salary: " + netSalary);
    }
   }
   class Programmer extends Employee {
    Programmer(String name, String empId, String address, String mailId, String mobileNo, double 
   basicPay) {
    super(name, empId, address, mailId, mobileNo, basicPay);
    }
   }
   class AsstProfessor extends Employee {
    AsstProfessor(String name, String empId, String address, String mailId, String mobileNo, double 
   basicPay) {
    super(name, empId, address, mailId, mobileNo, basicPay);
    }
   }
   class AssociateProfessor extends Employee {
    AssociateProfessor(String name, String empId, String address, String mailId, String mobileNo, 
   double basicPay) {
    super(name, empId, address, mailId, mobileNo, basicPay);
    }
   }
   class Professor extends Employee {
    Professor(String name, String empId, String address, String mailId, String mobileNo, double 
   basicPay) {
    super(name, empId, address, mailId, mobileNo, basicPay);
    }
   }
   class PaySlipGenerator {
    public static void main(String[] args) {
    Programmer programmer = new Programmer("Harsh yadav", "E1", "kelambakkam", 
   "Shashank@gmail.com", "555-1234", 50000);
    programmer.generatePaySlip();
    AsstProfessor asstProfessor = new AsstProfessor("Rahul sing", "E2", "456 chandigarh",
   "rahul@example.com", "548-5678", 60000);
    asstProfessor.generatePaySlip();
    AssociateProfessor associateProfessor = new AssociateProfessor("Ritik dhariwal", "E3", 
   "Vandlur", "ritik@example.com", "578-9152", 70000);
    associateProfessor.generatePaySlip();
    Professor professor = new Professor("Pranjul", "E4", "121 zirkpur St", "Pranjul@example.com", 
   "248-365", 80000);
    professor.generatePaySlip();
    }
   }
   