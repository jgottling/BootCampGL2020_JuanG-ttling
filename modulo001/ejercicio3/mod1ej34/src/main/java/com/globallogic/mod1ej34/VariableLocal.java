package com.globallogic.mod1ej34;

public class VariableLocal 
{
    public static void main( String[] args )
    {
    	
    	Student estudiante = new Student();
    	
        estudiante.details.studentAge();
        
		//System.out.println( "La edad del estudiante es: " + age );

    }
    
}

class Student {
	StudentDetails details = new StudentDetails();
	
}

class StudentDetails {
	
	public void studentAge() {
		int age = 0;
		age += 5;
		System.out.println( "La edad del estudiante es: " + age );
	}
}

