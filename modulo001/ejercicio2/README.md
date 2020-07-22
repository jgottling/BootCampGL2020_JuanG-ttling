- [X] 1. Crear un proyecto Maven con el comando **mvn archetype:generate** (En modo no interactivo)
	<img src="screenshots/maven1.png" height="500">
	- Agregar las siguientes dependencias para Log4j (Log4j es una biblioteca para el manejo y registros de logs)
	<img src="screenshots/maven2.png" >

- [ ] 2. Crear un proyecto Maven con los siguientes parámetros:
	- **Paquete**: com.globallogic.app **Proyecto**: bootcampgl2020 Version: 1.1
	- Agregar la siguiente dependencias:
		- groupId: org.junit.jupiter artifactId: junit-jupiter-engine version: 5.1.0 scope: test
		- groupId: org.junit.platform artifactId: junit-platform-surefire-provider version: 1.0.0
		- groupId: org.slf4j artifactId: slf4j-simple version: 1.7.30
	- Descargar dependencias.
	- Importarlo al STS, y compilarlo
	<img src="screenshots/maven3.png" >
	
- [ ] 3. Modificar el archivo pom.xml creado en el punto 2
	<img src="screenshots/maven4.png" >
