class Student1{
	int marks;
	String name;
	
	Student1(){
		System.out.println("Creating a Student Object");   // Called when object is created using default constructor
		name = "Default Name";          // Assign default name
	}
	
	Student1(String n, int m){
		System.out.println("Creating a Student Object with name " + n + " and marks " + m);  
		name = n;           // Assign name from argument
		marks = m;          // Assign marks from argument
	}
}



class App1{
	public static void main(String[] args){
		
		System.out.println("Welcome to Demo Class App");    		
		Student1 stu1=new Student1();     // Using default constructor
		
		System.out.println("Marks of " + stu1.name + " is " +stu1.marks);  // Default name, Default marks // Output: Marks of Default Name is 0
		stu1.marks=100;
		System.out.println("Marks of " + stu1.name + " is " +stu1.marks);  // Default name, updated marks // Output: Marks of Default Name is 100
		stu1.name="Yazhu";          // Changing name
		System.out.println("Marks of " + stu1.name + " is " +stu1.marks);  // Updated name and marks // Output: Marks of Yazhu is 100
		
		Student1 stu2=new Student1("Rose",50);          // Using parameterized constructor
		stu2.marks=90;         // Changing marks
		stu2.name="Ana";       // Changing name
		System.out.println("Marks of " + stu2.name + " is " +stu2.marks); // After updating values. // Output: Marks of Ana is 90
	}
}

/*
Output:
	Welcome to Demo Class App
	Creating a Student Object
	Marks of Default Name is 0
	Marks of Default Name is 100
	Marks of Yazhu is 100
	Creating a Student Object with name Rose and marks 50
	Marks of Ana is 90
*/