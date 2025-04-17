import it.*;
import it.hons.*;
import amc.*;

class App{
	public static void main(String[] ar){
		// We use the full name of the class (with its package name) when two classes have the same name, 
		// like amc.FirstYear and it.FirstYear, so that the computer knows which one we mean.
		amc.FirstYear fya=new amc.FirstYear();         // AMC FirstYear
		it.FirstYear fy=new it.FirstYear();            // IT FirstYear
		
		SecondYear sy=new SecondYear();                // Direct from amc
		FourthYear itHons=new FourthYear();            // Directly from it.hons
		
		fya.display();
		fy.display();
		sy.display();
		itHons.display();
	}
}

/*
Output:
	Hi from FirstYear AMC in package amc
	Hi from FirstYear in package it
	Hi from SecondYear in package amc
	Hi from FourthYear in package it.hons
*/