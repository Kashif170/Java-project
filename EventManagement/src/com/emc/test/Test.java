package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl;

public class Test {

	public static void main(String[] args) {
Organizer organizer = new Organizer();
organizer.setId(1231l);
organizer.setName("hassan");
System.out.println(organizer);
System.out.println(organizer.getName());
Event event = new Event(4561l, "i phone 100 launch", "grand launch");
System.out.println(event.getDescription());
EventManager em = new EventManagerImpl();
System.out.println(em.create(4561l));
	}

}
