import java.util.Scanner;

public class bill{
public static void main(String[]args){
	double MilkPrice = 3.0;
	double BreadPrice = 0.8;
	double EggPrice = 0.56;
	 int MilkQty,BreadQty,EggQty;
	 Scanner input = new Scanner(System.in);
	 System.out.println("ENTER MILK QTY");
	 MilkQty = input.nextInt();
	 System.out.println("ENTER BREAD QTY");
	 BreadQty = input.nextInt();
	 System.out.println("ENTER EGG QTY");
	 EggQty = input.nextInt();
	 double total = (MilkPrice*MilkQty)+(BreadPrice*BreadPrice)+(EggPrice*EggQty);
	 double finaltotal= total+ total*0.16;
	 System.out.println("Bill Total="+total);
	 System.out.println("Bill Total with Tax="+finaltotal);
}
}
	 
