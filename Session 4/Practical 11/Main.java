class Person1{
	public String name;      // Public variable for storing name
	
	//Getter
	public String getname(){
		return name;
	}
	
	//Setter
	public void setName(String newName){
		this.name=newName;
	}
}	

public class Main{
	public static void main(String[] args){
		Person1 p1=new Person1();   // Create object of Person1
		p1.name = "John";           // Directly set the name 
		System.out.println(p1.name);          // Print the name
	}
}


// Output: John