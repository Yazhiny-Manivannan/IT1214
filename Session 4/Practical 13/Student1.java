class Student1 {

	String name="Yazhu";       // Default value
	int marks = 100;           // Default value
	 
	Student1(){   //Default Constructor
		name = "Noname";
	}
	
	Student1 (String n){     // Parameterized Constructor with one argument
		name = n;
	}
	
	Student1 (String n, int m){     // Parameterized Constructor with two arguments
		name = n;
		marks = m;
	}
	
}


