Algoritmo NotasEstudiantes
    Definir nota_programacion1, nota_matematicas1, promedio1 Como Real
    Definir nota_programacion2, nota_matematicas2, promedio2 Como Real
    Definir nota_programacion3, nota_matematicas3, promedio3 Como Real
	
    Escribir "Introduce la nota de Programación y Matemáticas del Estudiante 1: "
    Leer nota_programacion1, nota_matematicas1
    Escribir "Introduce la nota de Programación y Matemáticas del Estudiante 2: "
    Leer nota_programacion2, nota_matematicas2
    Escribir "Introduce la nota de Programación y Matemáticas del Estudiante 3: "
    Leer nota_programacion3, nota_matematicas3
	
    promedio1 <- (nota_programacion1 + nota_matematicas1) / 2
    promedio2 <- (nota_programacion2 + nota_matematicas2) / 2
    promedio3 <- (nota_programacion3 + nota_matematicas3) / 2
	
    Si promedio1 >= 7.5 Entonces
        Escribir "Estudiante 1: Aprobado con promedio ", promedio1
    Sino
        Escribir "Estudiante 1: No Aprobado con promedio ", promedio1
    Fin Si
	
    Si promedio2 >= 7.5 Entonces
        Escribir "Estudiante 2: Aprobado con promedio ", promedio2
    Sino
        Escribir "Estudiante 2: No Aprobado con promedio ", promedio2
    Fin Si
	
    Si promedio3 >= 7.5 Entonces
        Escribir "Estudiante 3: Aprobado con promedio ", promedio3
    Sino
        Escribir "Estudiante 3: No Aprobado con promedio ", promedio3
    Fin Si
FinAlgoritmo
