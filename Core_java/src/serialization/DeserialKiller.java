package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserialKiller {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("D:\\serilization\\killer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		Employee emp = (Employee) obj;
		
		System.out.println(" My Employee id is:  " +emp.id);
		System.out.println(" My Employee name is:  "+emp.name);
		System.out.println(" My Employee salary is:  "+emp.salary);
		System.out.println(" My Employee Ssn is:"  +emp.ssn);
	}

}
