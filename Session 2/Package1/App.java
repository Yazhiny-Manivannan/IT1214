import p1.Class1;           // Import specific class from p1
//import p2.Class2;         // Can also be imported specifically
//import p2.class3;         // Can also be imported specifically
import p2.*;                // To import to include all classes in p2

class App{
	public static void main(String[] ar){
		Class1 c1=new Class1();        // Object of class1 in package p1
		c1.display();
		
		Class2 c2=new Class2();        // Object of class2 in package p2
		c2.display();
		
		Class3 c3=new Class3();        // Object of class3 in package p2
		c3.display();
	}
}

/*
Output:
	Hi from Class1 in package p1.
	Hi from Class2 in package p2.
	Hi from Class3 in package p2.
*/