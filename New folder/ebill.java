import java.util.*;

class ebill {
    Scanner in = new Scanner(System.in);
    Scanner ins = new Scanner(System.in);
    String cname, ctype, reg;
    double current, previous, tbill, units;

    void getdata() {
        System.out.print("\n\t Enter consumer number ");
        reg = ins.nextLine();
        System.out.print("\n\t Enter Type of connection ");
        ctype = ins.nextLine();
        System.out.print("\n\t Enter consumer name ");
        cname = ins.nextLine();
        System.out.print("\n\t Enter previous month reading ");
        previous = in.nextDouble();
        System.out.print("\n\t Enter current month reading ");
        current = in.nextDouble();
    }

    void calc() {
        units = current - previous;
        if (ctype.equals("domestic")) {
            System.out.println("\n\t You have a Domestic Account");
            if (units <= 100)
                tbill = 1 * units;
            else if (units > 100 && units <= 200)
                tbill = 2.50 * units;
            else if (units > 200 && units <= 500)
                tbill = 4 * units;
            else
                tbill = 6 * units;
        } else {
            System.out.println("\n\t You have a Commercial Account");
            if (units <= 100)
                tbill = 2 * units;
            else if (units > 100 && units <= 200)
                tbill = 4.50 * units;
            else if (units > 200 && units <= 500)
                tbill = 6 * units;
            else
                tbill = 7 * units;
        }
    }

    void display() {
        System.out.println("\n\t This month's bill is " + tbill);
    }

    public static void main(String[] args) {
        ebill clc = new ebill();
        clc.getdata();
        clc.calc();
        clc.display();
    }
}