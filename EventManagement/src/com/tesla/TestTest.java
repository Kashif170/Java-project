package com.tesla;
import com.emc.entities.Organizer;
import com.emc.entities.Venue;
import com.kms.oopsobject.*;
import com.manager.*;
import com.kms.oopsobject.EventDY;

public class TestTest {
	
	/**
	 * @param args
	 */
	public static void main(String[]args) {
	
		EvmBaseParent I = new EvmBaseParent();
		System.out.println("Welcome to the paradise");
		System.out.println();
		System.out.println("This is jewelery event ");
		System.out.println();
		System.out.println("Precious Diamond are there u never watch in ur dream ");
		System.out.println();
		System.out.println("lets come to see");
		System.out.println();
		System.out.println(" our manager will show u Everything");
		
		I.setName("");
		System.out.println("hello my name is zayn ");
		System.out.println("My Id no is *0980*");
		System.out.println("I will guide u what type of things are there in our event ");
		System.out.println("If anything u want please let me know");
		I.setId(2234l);
		
		
		System.out.println(I.getId());
		System.out.println(I.getName());
		
		EventDY d = new EventDY(1234l,"kashif","grand launch");
		d.setStartTime("Morning 10am we will start our work  ");
		System.out.println();
		d.setEndTime("packup in between last 9pm close");
		System.out.println();
		d.setDescription("next event is soon take our card and cntact me ");
		System.out.println();
		System.out.println(d.getStartTime());
		System.out.println(d.getEndTime());
		System.out.println(d.getDescription());
		System.out.println(d.getName());
		System.out.println(d.getId());
		
EventChild evm = new EventChild();
System.out.println(evm.create(4321l));

System.out.println();

Organizer o = new Organizer();
o.setId(1234l);
o.setName("Welcome to the my ");

System.out.println(o.getName());
System.out.println();
System.out.println(o.getId());

ParticipantC p = new ParticipantC();
System.out.println();
p.setCheckdIn("Out time");
p.setEmail("shaikhkashif@gmail.com");
p.setId(171l);

System.out.println(p.getCheckdIn());
System.out.println(p.getEmail());
System.out.println(p.getId());

Venue v = new Venue();

v.setCity("Mumbai");
v.setDescription("dream place for everyone");
v.setId(789l);
v.setPincode("400079");
v.setState("Maharashrta");
v.setStreetAdress("Bandra near seaways mannat");
 
System.out.println(v.getCity());
System.out.println(v.getDescription());
System.out.println(v.getId());
System.out.println(v.getPincode());
System.out.println(v.getState());
System.out.println(v.getStreetAdress());
	
	}	

}
