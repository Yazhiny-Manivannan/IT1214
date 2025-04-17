import human.*;

class App{
	public static void main(String[] ar){
		System.out.println("Welcome to Invoice App");
		Person naveen=new Person("Naveen");
		naveen.talk("Hi from Naveen");     // Inherited method from Human
	}
}

/*
Output:
	Welcome to Invoice App
	Human says: Hi from Naveen
*/