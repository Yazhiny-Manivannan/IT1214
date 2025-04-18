class Car1{
	private String model;      // private variable, only accessible through methods
	
	//Getter
	public String getmodel(){
		return model;
	}
	
	// Setter method to set the model
	public void setmodel(String Toyota){
		this.model=Toyota;              // 'this' refers to the current object
	}
}

public class Car1Demo{
	public static void main(String[] args){
		Car1 c1=new Car1();         // Create object of Car1
		c1.setmodel("Toyota Corolla");        // Set model using setter
		System.out.println(c1.getmodel());    // Print model using getter
	}
}

// Output: Toyota Corolla