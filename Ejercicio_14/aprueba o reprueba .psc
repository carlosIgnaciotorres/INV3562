Proceso DeterminarAprobacion
    Definir calificacion1, calificacion2, calificacion3, promedio Como Real
	
   
    Escribir "Ingresa la primera calificación: "
    Leer calificacion1
    
    Escribir "Ingresa la segunda calificación: "
    Leer calificacion2
    
    Escribir "Ingresa la tercera calificación: "
    Leer calificacion3
	
    
    promedio = (calificacion1 + calificacion2 + calificacion3) / 3
	
    
    Si promedio >= 10.5 Entonces
        Escribir "El alumno aprueba con un promedio de ", promedio
    Sino
        Escribir "El alumno reprueba con un promedio de ", promedio
    FinSi
FinProceso
