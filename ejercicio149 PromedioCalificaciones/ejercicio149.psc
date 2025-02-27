Algoritmo PromedioCalificaciones
    Dimension calificaciones[3]  // Declarar el arreglo con Dimension
    Definir suma Como Entero
    Definir promedio Como Real
    Definir i Como Entero
    Definir resultado Como Cadena
    
    
    calificaciones[1] = 85
    calificaciones[2] = 90
    calificaciones[3] = 78
    
    suma = 0
    
    
    Para i = 1 Hasta 3 Con Paso 1 Hacer
        suma = suma + calificaciones[i]
    FinPara
    
    
    promedio = suma / 3
    
    
    Si promedio > 70 Entonces
        resultado = "Aprobado"
    Sino
        resultado = "Reprobado"
    FinSi
    
    
    Escribir "El promedio es: ", promedio
    Escribir "Resultado: ", resultado
FinAlgoritmo