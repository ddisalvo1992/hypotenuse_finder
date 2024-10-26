package hypotenuse_finder;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);//for user input
		
		double x;
		double y;
		double z;
		
		System.out.print("Enter x: ");
		x=scanner.nextDouble();
		System.out.print("Enter y: ");
		y=scanner.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotenuse is: "+z);

	}

}
