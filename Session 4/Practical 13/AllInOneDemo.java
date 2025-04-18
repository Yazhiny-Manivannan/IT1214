class AllInOneDemo{
	
	static void print(String s){       // Utility method to print strings
		System.out.println(s);
	}
	
	public static void main(String[] args){
		Student1 s1 = new Student1("Charle");         // Student1 object using 1-parameter constructor
		Student1 s2 = new Student1();                 // Student1 object using default constructor
		Student1 s3 = new Student1("Don",55);         // Student1 object using 2-parameter constructor
		
		// Display student data
		print("Name of the student s1 is " + s1.name + " Marks = " + s1.marks);
		print("Name of the student s2 is " + s2.name + " Marks = " + s2.marks);
		print("Name of the student s3 is " + s3.name + " Marks = " + s3.marks);
		
		Car c1 = new Car();               // Object of Car class
		c1.setmodel("Mazda S3");          // Setting model
		
		Car c2 = new Car("Nissan Navara");       // Car object using parameterized constructor
		
		print("Model of the Car c1 is " + c1.getmodel());
		print("Model of the Car c2 is " + c2.getmodel());
	}
}

/*
Output
	Name of the student s1 is Charle Marks = 100
	Name of the student s2 is Noname Marks = 100
	Name of the student s3 is Don Marks = 55
	Model of the Car c1 is Mazda S3
	Model of the Car c2 is Nissan Navara
*/