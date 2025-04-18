class Person{
	protected String name;
	
	//Getter
	public String getname(){
		return name;
	}
	
	//Setter
	public void setName(String newName){
		this.name=newName;
	}	
}	

public class Details{
	public static void main(String[] args){
		Person p=new Person();
		p.setName("John");         // Setting the name using setter method.
		System.out.println(p.getname()); // Getting the name using getter method.
	}
}

// Output: John