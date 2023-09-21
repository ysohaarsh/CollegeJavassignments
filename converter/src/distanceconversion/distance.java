package converter.src.distanceconversion;

import java.util.*;
public class distance {
	double km,m,miles;
	Scanner sc= new Scanner(System.in);
	public void kmtom() {
		System.out.print("Enter in km");
		km=sc.nextDouble();
		m=(km*1000);
		System.out.println(km+"km"+"eqaul to"+m+"meters");	
	}
	public void mtokm() {
		System.out.print("Enter in m");
		m=sc.nextDouble();
		km=(m/1000);
		System.out.println(m+"m"+"eqaul to"+km+"kilometers");	
	}
	public void milestokm() {
		System.out.print("Enter in miles");
		miles=sc.nextDouble();
		km=(miles*1.60934);
		System.out.println(miles+"miles"+"eqaul to"+km+"kilometers");	
	}
	public void kmtomiles() {
		System.out.println("Enter in km");
		km=sc.nextDouble();
		miles=(km*0.621371);
		System.out.println(miles+"miles"+"equals to"+km+"kilometers");
	}

}
