class One{
	int a=10;          // Variable declaration with initialization.
	int b;             // Variable declaration
	
	void printDetails(){       // Method to print details of class One
		System.out.println("From class One a = " + a);
		System.out.println("From class One b = " + b);
	}
}

class Two{
	int a,c;
	
	void printDetails(){       // Method to print details of class Two
		System.out.println("From class Two a = " + a);
		System.out.println("From class Two c = " + c);
	}
}

class App{
	public static void main(String args[]){
		One o1=new One();  // Object names should start with a small letters.
		Two t1=new Two();

		o1.printDetails();      // Calling method
		o1.b=100;               // Assign value to b
		o1.printDetails();      // calling method after assigning values.
		t1.printDetails();    
		t1.a=20;                // Assign value to a
		t1.c=30;                // Assign value to c
		t1.printDetails();
	}
}

/*
Output:
	From class One a = 10
	From class One b = 0
	From class One a = 10
	From class One b = 100
	From class Two a = 0
	From class Two c = 0
	From class Two a = 20
	From class Two c = 30
*/