class Student{
	int marks;            // Variable to store marks
	String name;          // Variable to store name
	
	Student(){
		System.out.println("Creating a Student Object");  // Message when student is created
		name = "Default Name";        // Assign default name
	}
	
	Student(String n, int m){
		System.out.println("Creating a Student Object " + n + " and marks " + m);
	}
}

class Printer{
	void print(String s){
		System.out.println(s);         // Print the message given
	}
}

class App{
	public static void main(String[] args){
		Printer p=new Printer();        // Creating a Printer object
		
		p.print("Welcome to Demo Class App");      // Printing welcome message
		
		Student stu=new Student();           // Student object using default constructor
		
		stu.marks=100;                       // Setting marks
		stu.name="Yazhu";                    // Setting name
		
		p.print("Marks of " + stu.name + " is " +stu.marks);         // Printing student info
	}
}

/*
Output:
	Welcome to Demo Class App
	Creating a Student Object
	Marks of Yazhu is 100
*/