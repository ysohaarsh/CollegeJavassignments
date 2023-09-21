package converter.src.currencyconversion;
import java.util.*;
public class Currency {

 double euro,yen;
 double inr,usd;
 Scanner sc=new Scanner(System.in);
 public void dollartorupee(){
     System.out.println("Enter dollars to convert into ruppees");
     usd=sc.nextInt();
     inr=usd*82;
     System.out.println("Dollar="+usd+"eqauls to INR="+inr);
 }
 public void rupeetodollar(){
     System.out.println("Enter rupees to convert into dollars");
     inr=sc.nextInt();
     usd=(inr/82);
     System.out.println("Rupees="+inr+"eqauls to USD="+usd);
 }
 public void eurotorupee(){
     System.out.println("Enter euros to convert into ruppees");
     euro=sc.nextInt();
     inr=euro*98;
     System.out.println("Euro="+euro+"eqauls to INR="+inr);
 }
 public void rupeetoeuro(){
     System.out.println("Enter rupees to convert into euros");
     inr=sc.nextInt();
     euro=(inr/98);
     System.out.println("Rupees="+inr+"eqauls to euros="+euro);
 }
 public void yentorupee(){
     System.out.println("Enter yen to convert into ruppees");
     yen=sc.nextInt();
     inr=yen*2.2;
     System.out.println("Yen="+yen+"eqauls to INR="+inr);
 }
 public void rupeetoyen(){
     System.out.println("Enter rupees to convert into yen");
     inr=sc.nextInt();
     yen=(inr/2.2);
     System.out.println("Rupees="+inr+"eqauls to yens="+yen);
 }

}
