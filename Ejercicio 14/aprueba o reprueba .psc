Proceso DeterminarAprobacion
    Definir calificacion1, calificacion2, calificacion3, promedio Como Real
	
   
    Escribir "Ingresa la primera calificaci�n: "
    Leer calificacion1
    
    Escribir "Ingresa la segunda calificaci�n: "
    Leer calificacion2
    
    Escribir "Ingresa la tercera calificaci�n: "
    Leer calificacion3
	
    
    promedio = (calificacion1 + calificacion2 + calificacion3) / 3
	
    
    Si promedio >= 10.5 Entonces
        Escribir "El alumno aprueba con un promedio de ", promedio
    Sino
        Escribir "El alumno reprueba con un promedio de ", promedio
    FinSi
FinProceso
