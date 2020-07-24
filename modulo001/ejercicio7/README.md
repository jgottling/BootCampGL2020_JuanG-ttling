## Interfaces  
1. Creamos una interface  
Pasos:
- Crear una interfaz InterfaceAnimal.
- Definir dentro de la interfaz dos métodos: dormir y sonidoAnimal.  
- Crear una clase Perro que implemente la clase Animal.  
- Implementar los métodos creados en la interfaz Animal.  
- En cada método mostrar un mensaje de salida.  
- Crear una clase MainAnimal que posea un método main().  
- En el main crear una variable dog de tipo Perro e inicializarla.  
- Invocar los métodos creados anteriormente, primero a dormir y luego a sonidoAnimal.  
Se espera como salida:  
	```  
	Zzz  
	El perro hace guau guau    
	```  
  
2. Método default y static  
Pasos:  
- A la interface creada en el ejercicio anterior le vamos a agregar 2 nuevos métodos.  
- Un método default llamado Come, que tiene como parámetro un string, en este método vamos a mostrar un mensaje que sea System.out.println("El " + s + " se alimenta");  
- Un método static llamado camina, que tiene como parámetro un string, en este método vamos a mostrar un mensaje que sea System.out.println("El " + s + " camina");  
- En el main se agrega la invocación a estos métodos, pasandole a ambos el “perro” como parámetro.  
Se espera como salida:  
	```  
	El perro hace guau guau  
	Zzz  
	El perro se alimenta  
	El perro camina  
	```  
  
3. Método default y múltiples interfaces  
Pasos:  
- Crear una interfaz Persona.  
- Crear dos métodos hablar, dormir y un método por default come.  
- Crear una clase Hombre que implemente la clase Animal y Persona.  
- Implementar los métodos creados en ambas interfaces.  
- En cada método mostrar un mensaje de salida.  
- En la misma clase agregar un método main().  
- Crear un objeto de tipo Hombre e invocar a los métodos implementados anteriormente.  
- Validar la salida.  
Se espera como salida:  
	```  
	El hombre duerme muchas horas  
	Las personas hablan mucho  
	El hombre no hace sonidos de animal  
	Se ejecuta método de la clase Hombre  
	```  
