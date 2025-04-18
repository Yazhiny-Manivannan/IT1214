class Student{
	//String name;
	String name="Yazhu";            // Initial values
	//int marks;
	int marks=100;
	
	Student(){   //Default Constructor
		name="Noname";
	}
	
	Student (String n){       // Constructor with one parameter
		name=n;
	}
	
	Student (String n, int m){       // Constructor with two parameters
		name=n;
		marks=m;
	}
	
}

/*
class TestClass{
	int a;
	public static void main(String[] args){              // We can use more than one main method in one source file.
		System.out.println("Hi From TestClass Class");
	}
}
*/

class StudentDemo{
	public static void main(String[] ar){
		System.out.println("Hi From StudentDemo Class");
		System.out.println("Creating an object of Student Class");
		
		//Student stu=new Student();  // stu is a student type Object.  Here, Student() is a constructor.
		
		// Creating object using parameterized constructor
		Student stu=new Student("Nice name", 85);
		System.out.println("Created an object of Student Class");
		
		// Accessing values
		System.out.println("Name value of the object is " + stu.name);
		System.out.println("Marks value of the object is " + stu.marks);
		
		// Changing values
		stu.name="Ana";         //Setting the variable value.
		stu.marks=99;
		System.out.println("Name value of the object is " + stu.name);
		System.out.println("Marks value of the object is " + stu.marks);
	}
}

/*
Output:
	Hi From StudentDemo Class
	Creating an object of Student Class
	Created an object of Student Class
	Name value of the object is Nice name
	Marks value of the object is 85
	Name value of the object is Ana
	Marks value of the object is 99
*/