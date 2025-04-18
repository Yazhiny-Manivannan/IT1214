class Rectangle{
	
	private int height;        // Only accessible inside Rectangle class
	int width; 
	
	Rectangle(){           // Default constructor
		height = 2;          // Setting default value.
		width = 2;           // Setting default value.
	}
	
	Rectangle(int height, int width){       // Parameterized constructor
		this.height = height;               // Use 'this' to set current object's height
		this.width = width;                 // Use 'this' to set current object's width
		
		System.out.println("Just Created a rectangle object with size (h*w) "+this.height*this.width);    // Just Created a rectangle object with size (h*w) 5
		print(width,height);     // Print the pattern of the rectangle
	}
	
	void get_details(){        // Method to show height and width of the rectangle
		System.out.println("R1: Height " + height + ", Width " + width );
	}
	
	void print(int width, int height){      // Method to print the rectangle using stars
		for(int i=0; i<height; i++){        // Outer loop for height (rows)
			for(int j=0; j<width; j++){     // Inner loop for width (columns)
				System.out.print("* ");      // Print * in same line
			}
			System.out.println(" ");        // Here, we use 'println' to break lines.
		}
	}
}

class Main{
	public static void main(String[] args){
		
		Rectangle r1=new Rectangle(5,3);         // Custom rectangle with 5 height, 3 width
		Rectangle r2=new Rectangle();            // Rectangle with default values (2,2)
		
		r1.get_details();       // Show size of r1
		r2.get_details();       // Show size of r2
		
	
		Rectangle r3=r1;        // r3 refers to the same object as r1
		
		System.out.println(" ");    // To break lines
		
		r1.print(5,5);
	}
}

/* 
Output:
	* * *
	* * *
	* * *
	* * *
	* * *
	R1: Height 5, Width 3
	R1: Height 2, Width 2

	* * * * *
	* * * * *
	* * * * *
	* * * * *
	* * * * *
*/