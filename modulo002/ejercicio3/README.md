### Mockito  
  
1. Para este ejemplo, utilizaremos el proyecto provisto en el archivo mockito.example.zip. Para poder implementar un test completo de la librería, se tendrá que crear un mock para probar los objetos
instanciados, para ello:  
- Agregar al pom las dependencias de mockito:  
  - **groupId**: org.mockito, **artifactId**: mockito-core, **version**: 3.4.0, **scope**: test  
  - **groupId**: org.mockito, **artifactId**: mockito-junit-jupiter, **version**: 3.4.0, **scope**: test  
- Modificar el test para que utilice mockito, agregando la annotation: _@ExtendWith(MockitoExtension.class)_
- Implementar un mock de la interfaz y probar la librería:
  - Agregar un atributo a la clase: 
  ```java  
  @Mock  
  Vehicle vehicleMock;  
  ```
  
  - Modificar el test Crash para que utilice el mock y volver a realizar la prueba.  
  ```java  
  @Test  
  void WhenCrashAndCorrectValueThenOk() {  
  ...  
  Mockito.when(vehicleMock.getMass()).thenReturn(10.0);  
  Mockito.when(vehicleMock.getMaxSpeed()).thenReturn(5.0);  
  crashTest.crash(vehicleMock);  
  ...  
  ```
  
---
2. En base al ejercicio 2, tomando el proyecto de la lotería, sin modificaciones sobre las clases del paquete **coverage.loteria**, construir un test que genere los mocks necesarios para cubrir un 100% las
pruebas de cobertura.  
  
