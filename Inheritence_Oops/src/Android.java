 
public class Android {
	double a;
	String name;
	String color;
	int display;
	float f;
	
	void funtionality() {
	double a =12.2;
	System.out.println("fuctioning all application:  "+a);
		
	}void calling(){
		String name = "realme";
		System.out.println("easy to call anywhere:  "+name);
		
	}void camera(){
		String color = "white";
		System.out.println("to pull the photo clear:  "+color);
		
	} void portable() {
		int display = 6;
		System.out.println("amoled display in all mobile:  "+display);
		
		
	}  void  hotspot() {
		float f = 11.2f;
		System.out.println("sharing hotspot to android mobiles:  "+f);
		
		
		
	}

	public static void main(String[] args) {
		Android a = new Android();
		a.funtionality();
		a.camera();
		a.hotspot();
		a.calling();
		a.portable();
		

	}

}
