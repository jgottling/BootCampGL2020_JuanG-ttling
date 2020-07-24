package com.globallogic.mod1ex6.mocks;

import java.util.ArrayList;
import java.util.List;

import com.globallogic.mod1ex6.models.Empleado;

public class EmpMock {
	private static EmpMock instance;
	private static List<Empleado> empleados;
	private static int maxEmpleados = 20;
	
	public static int getMaxEmpleados() {
		return maxEmpleados;
	}

	public static void setMaxEmpleados(int maxEmpleados) {
		EmpMock.maxEmpleados = maxEmpleados;
	}
	
	private EmpMock () {
		
	}
	
	public static EmpMock getInstance() {
		
		if (EmpMock.empleados == null) {
			EmpMock.empleados = new ArrayList<Empleado>();
		}
		
		if (EmpMock.instance == null) {
			EmpMock.instance = new EmpMock();
			EmpMock.createEmpleados();
		}
		return EmpMock.instance;	
	}

	public static List<Empleado> getEmpleados() {
		return EmpMock.empleados;
	}

	public static void setEmpleados(List<Empleado> empleados) {
		EmpMock.empleados = empleados;
	}
	
	public static void addEmpleado(Empleado empleado) {
		
		if(EmpMock.empleados.size() < 19 )
			EmpMock.empleados.add(empleado);
		else
			System.out.println("No se pueden agregar más empleados");
	}

	private static void createEmpleados() {
		Empleado emp1 = new Empleado();
		Empleado emp2 = new Empleado(987654321);
		Empleado emp3 = new Empleado();
		
		emp1.setCasado(false);
		emp1.setDni(12345678);
		emp1.setHorasExtra(5);
		emp1.setId(243243);
		emp1.setNombre("Emp1");
		emp1.setNumeroDeHijos(0);
		emp1.setSueldoBase(50000);
		emp1.setTipoIRPF(0.24);
		
		emp2.setCasado(true);
		emp2.setHorasExtra(20);
		emp2.setId(53454353);
		emp2.setNombre("Emp2");
		emp2.setNumeroDeHijos(3);
		emp2.setSueldoBase(450000);
		emp2.setTipoIRPF(0.35);
		
		emp3.setCasado(true);
		emp3.setDni(123222278);
		emp3.setHorasExtra(15);
		emp3.setId(3453443);
		emp3.setNombre("Emp3");
		emp3.setNumeroDeHijos(0);
		emp3.setSueldoBase(150000);
		emp3.setTipoIRPF(0.28);
		
		EmpMock.addEmpleado(emp1);
		EmpMock.addEmpleado(emp2);
		EmpMock.addEmpleado(emp3);
	}
}
