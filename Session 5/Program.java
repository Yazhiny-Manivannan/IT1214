class Paper{
	int length;
	int width;
	String text;
}

class Document{
	String name;   // Declaration of String type variable 
	Paper p;       // Declaration of Paper type object p
	
	public static void main(String[] args){
		Document d=new Document();   // d is a Document class instance
		System.out.println("Created a Document object d");	
		d.name="My First Document";
		System.out.println("Name of the Document d is " + d.name);
		
		d.p=new Paper();       // Creating Paper object.  
		/* 
		Here, if we didn't write this (above) method it will throw a 
		null point Exception error. Bcz, we didn't set any values for length, width & text. 
		This method allocate the space for length, width & text in the RAM.
		*/
		
		d.p.length=10;
		d.p.width=4;
		d.p.text= "This is the text in the paper of document My first document";
		System.out.println("Size 1*w of the paper p of the document d is " + d.p.length + "*" + d.p.width);
		System.out.println("Text valueof the paper p of the document d is " + d.p.text);
		
		Document d2=new Document();
		System.out.println("Created a Document object d2");
		d2.name="My Second Document";
		System.out.println("Name of the Document d is " + d2.name);
		
	}
}