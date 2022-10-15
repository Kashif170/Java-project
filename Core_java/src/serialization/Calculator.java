package serialization;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	while(true) {	Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		float a=sc.nextFloat();
		
		System.out.println("Enter the second number");
		float b=sc.nextFloat();
		
		System.out.println("1 Add, 2 sub, 3 Multiply, 4 Divide, 5 percent");
	int calculate=sc.nextInt();
	
	switch(calculate) {
	case 1:
		System.out.println(a+b);
		break;
		
	case 2:
		System.out.println(a-b);
		break;
		
	case 3:
		System.out.println(a*b);
		break;
		
	case 4:
		System.out.println(a/b);
		break;
		
	case 5:
		System.out.println(a/b*100+"%");
		break;
		
	case 6:
		System.out.println("clear");
		break;
	}
}
}
}