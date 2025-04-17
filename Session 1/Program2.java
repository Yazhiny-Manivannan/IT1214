class MySecondClass{    // Class name should start with capital letters.
	public static void main(String[] args){
		System.out.println("This the first argument is " + args[0]);   // args[0] is the first argument
		System.out.println("This the second argument is " + args[1]);  // args[1] is the second argument
		System.out.println("This the third argument is " + args[2]);   // args[2] is the third argument
	}
}

// Command to run : java MySecondClass Apple Banana Cherry

/*
Expected Output:
	This the first argument is Apple
	This the second argument is Banana
	This the third argument is Cherry
*/