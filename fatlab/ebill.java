import java.util.*;
class ebill{
    public static void main(String args[]){
        customerdata ob= new customerdata();
        ob.getdata();
        ob.calc();
        ob.display();
    }

}

class customerdata{
    String cname;
    String type;
    double current;
    double previous;
    double tbill;
    double units;
    int bn;
    Scanner sc=new Scanner(System.in);
    
    void getdata(){
            System.out.print("\n\t Enter the consumer number:");
            bn = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by previous nextInt()
            System.out.println("\n\t Enter the consumer name:");
            cname = sc.nextLine();
            System.out.println("\n\t Enter the type of connection (D for Domestic or C for Commercial):");
            type = sc.nextLine().toUpperCase(); // Convert the input to uppercase for case-insensitive comparison
            System.out.println("\n\t Enter the previous month reading:");
            previous = sc.nextDouble();
            System.out.println("\n\t Enter the current month reading:");
            current = sc.nextDouble();
    }
    public void calc() {
        units=current-previous;
        if(type.equals("D")){
            if(units<=100)
            tbill=1*units;
            else if(units>100 && units<=200)
            tbill=2.50*units;
            else if(units>200 && units<=500)
            tbill=4*units;
            else
            tbill=6*units;    
        }
        else{
            if(units<=100)
            tbill=1*units;
            else if(units>100 && units<=200)
            tbill=4.50*units;
            else if(units>200 && units<=500)
            tbill=6*units;
            else
            tbill=7*units; 
        }
    }

    public void display() {
        System.out.println("\n\t Consumer number:"+ bn);
        System.out.println("\n\t Consumer name:"+ cname);
        if(type.equals("D"))
        System.out.println("\n\t Type of connection=Domestic");
        else
        System.out.println("\n\t Type of connection=Commericial");
        System.out.println("\n\t Current reading:"+ current);
        System.out.println("\n\t Previous reading:"+ previous);
        System.out.println("\n\t Total units:"+ units);
        System.out.println("\n\t Toal bill=RS "+tbill);
        
    }
}