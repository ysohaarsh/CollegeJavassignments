import java.util.ArrayList;
import java.util.Scanner;

public class PatientRecords{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        ArrayList<Patient> patients=new ArrayList<Patient>();

        while(true){
            System.out.println("1. Add new Patient");
            System.out.println("2. Display all patient");
            System.out.println("3. Search patient by medical condition");
            System.out.println("4. Quit");

            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter patient name:");
                    String name= sc.next();
                    System.out.println("Enter patient age:");
                    int age=sc.nextInt();
                    System.out.println("Enter patient condition separated by commas:");
                    String conditionsString=sc.next();
                    String[] conditionsArray=conditionsString.split(",");
                    ArrayList<String> conditions= new ArrayList<String>();
                    for(String condition:conditionsArray){
                        conditions.add(condition.trim());
                    }
                    Patient patient =new Patient(name,age,conditions);
                    patients.add(patient);
                    System.out.println("Patient added successfully:");
                    break;
                case 2:
                    if(patients.size()==0){
                        System.out.println("No patient found.");
                    }
                    else{
                        System.out.println("List of all Patients");
                        for(Patient p:patients){
                            System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getConditions());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter medical conditon to search: ");
                    String searchCondition=sc.next();
                    ArrayList<Patient> matchingPatients=new ArrayList<Patient>();
                    for(Patient p:patients){
                        if(p.getConditions().contains(searchCondition)){
                            matchingPatients.add(p);
                        }
                    }
                    if(matchingPatients.size()==0){
                        System.out.println("No patients found with the given medical conditions.");
                    }else{
                        System.out.println("List of patients with the given medical condition:");
                        for(Patient p:matchingPatients){
                            System.out.println(p.getName()+"\t"+p.getConditions());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}

class Patient{
    private String name;
    private int age;
    private ArrayList<String> conditions;

    public Patient(String name,int age, ArrayList<String> conditions){
        this.name=name;
        this.age=age;
        this.conditions=conditions;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public ArrayList<String> getConditions(){
        return conditions;
    }
}