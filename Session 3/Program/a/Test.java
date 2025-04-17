package a;

public class Test{
	void print(){          // Default access - accessible only within package 'a'
		System.out.println("Hi from class Test in package a");
	}	
	
	public void display(){        // Public method - accessible anywhere
		print();
		System.out.println("Display: Hi from class Test in package a");
	}
}