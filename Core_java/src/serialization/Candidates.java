package serialization;

import java.io.Serializable;

public class Candidates implements Serializable {
	
	int id;
	String name;
	double salary;
	transient int ssn;
	
	Candidates(int id,String name,double salary,int ssn){
		
		id=id;
		name=name;
		salary=salary;
		ssn=ssn;
	}

}
