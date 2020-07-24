package com.globallogic.mod1ex6;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.globallogic.mod1ex6.mocks.EmpMock;
import com.globallogic.mod1ex6.models.Empleado;

public class App 
{
    public static void main( String[] args )
    {
    
    	Scanner input = new Scanner(System.in);
    	EmpMock.getInstance();
		
    	//Pedir cantidad de empleados
    	System.out.println("Ingrese la cantidad total de empleados");
    	int cantMax = input.nextInt();
    	EmpMock.setMaxEmpleados(cantMax);
    	    	
    	//Leer datos de empleados
    	List<Empleado> manyEmpleados = EmpMock.getEmpleados();
    	
		mostrarMayorYMenorSalario(manyEmpleados);
		
		mostrarEmpleadoMasCobraHsExtra(manyEmpleados);
	
		empleadosOrdenadosPorSalario(manyEmpleados);
		
		input.close();
		System.exit(0);
    }
    
    private static void empleadosOrdenadosPorSalario(List<Empleado> manyEmpleados) {
    	
    	manyEmpleados.sort(Comparator.comparingDouble(Empleado::getSalario));
    	
    	manyEmpleados.forEach(Empleado::toString);
	}

	private static void mostrarEmpleadoMasCobraHsExtra(List<Empleado> manyEmpleados) {
    	
		manyEmpleados.sort(Comparator.comparingDouble(Empleado::calcularMontoHorasExtra));
    	
    	System.out.print(
    			"\n El que menos horas extra cobra es: \n" + manyEmpleados.get(0).toString() +
    			"cobra por hora extra: " + manyEmpleados.get(0).calcularMontoHorasExtra() + "\n"
    			);
    	
    	System.out.print(
    			"\n El que más horas extra cobra es: \n" + manyEmpleados.get(manyEmpleados.size()-1).toString() + 
    			"cobra por hora extra: " + manyEmpleados.get(manyEmpleados.size()-1).calcularMontoHorasExtra() + "\n \n"
    			);
    }

    private static void mostrarMayorYMenorSalario(List<Empleado> manyEmpleados) {
    	
    	manyEmpleados.sort(Comparator.comparingDouble(Empleado::getSalario));
    	
    	System.out.print(
    			"\n El que menos cobra es: \n" + manyEmpleados.get(0).toString()+
    			"cobra: " + manyEmpleados.get(0).getSalario() + "\n"
    			);
    	
    	System.out.print(
    			"\n El que más cobra es: \n" + manyEmpleados.get(manyEmpleados.size()-1).toString() + 
    			"cobra: " + manyEmpleados.get(manyEmpleados.size()-1).getSalario() + "\n \n"
    			);  
    }
}
