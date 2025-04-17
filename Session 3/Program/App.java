import a.*;
import b.*;

class App{
	public static void main(String[] ar){
		a.Test t1=new a.Test();
		b.Test t2=new b.Test();
		
		//t1.print();            // Not accessible: print() has default access
		t1.display();        // Calls internal print() + display message
		t2.print();          // Public method from package b
		
	}
}

/*
Output:
	Hi from class Test in package a  
	Display: Hi from class Test in package a  
	Hi from class Test in package b
*/