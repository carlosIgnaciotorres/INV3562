Proceso CalcularPromedio
    Definir N, i Como Entero
    Definir numero, suma, promedio Como Real
    
    Escribir "Ingrese la cantidad de números:"
    Leer N
    
    suma <- 0
    
    Para i <- 1 Hasta N Hacer
        Escribir "Ingrese un número:"
        Leer numero
        suma <- suma + numero
    FinPara
    
    promedio <- suma / N
    
    Escribir "El promedio de los números ingresados es:", promedio
FinProceso
