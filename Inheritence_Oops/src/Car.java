
public class Car {

	String name;
	int quantity;// wheel
	int door;
	String glass;
	String whiper;
	String design;

	
	String color;
	float a;
	int power = 220;
	int b;


	Car() {
		System.out.println("$$U can find Details in Given Below:$$ ");
		System.out.println("");
	}

	{
		System.out.println("<<Welcome to my own world Tesla:<<");
		System.out.println("");
	}
	static {
		System.out.println("**billioniore keys Showroom:**  ");
		System.out.println("");
	}

	void Ac() {
		name = "shape";
		quantity = 4;
		door = 5;
		glass = "fibre";
		whiper = "steel";
		design = "unique";
		System.out.println("This car design in different shape (  " + name);
		System.out.println("the  wheel in this car are tubless :$#  " + quantity);
		System.out.println("");
		System.out.println("automatic door through sensor button<>  " + door);
		System.out.println("");
		System.out.println("The bullet proof car **   " + glass);
		System.out.println("water is drop instantly clear the dust((* " + whiper);
		System.out.println("");
		System.out.println("unique things run in market &&  " + design);
System.out.println("");
	}
		
	
	

	void brake() {
		color = "green";
		System.out.println("The royal color" + color);
		System.out.println("");
		System.out.println("1 tap instant car stop");
System.out.println("");
	}

	void automatic() {

		a = 19.0f;
		System.out.println("");
		System.out.println("all the access"
				+ ""
				+ " sensor quick on this version:" + a);
	}
	void autopitlot() {
		System.out.println("automatic car will run on this mode");
		System.out.println();
	}
void battery() {
	b = 50000;
	System.out.println("This car is electric run on battery:  "+b);
}
	public static void main(String[] args) {

		Car t = new Car();
	
		t.brake();
		t.automatic();
		t.Ac();
		t.battery();

		System.out.println(t.a);
		System.out.println(t.power);
		System.out.println(t.name);

	}

}
