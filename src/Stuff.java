
public class Stuff extends Person{

	public Stuff(String name, int id, int age, String sex, String address) {
		super(name, id, age, sex, address);
		
	}
	
	public String toString()    //Calling the toString function of Superclass
	{                           //it gets all the characterstics of the the toString of Superclass 
		
		return(super.toString());
		
	}
}
