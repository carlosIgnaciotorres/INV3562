Proceso ModaCalificaciones
    Definir N, i, j, maxFrecuencia, moda Como Entero
    Definir calificaciones, frecuencias Como Entero
    
    Escribir "Ingrese la cantidad de calificaciones:"
    Leer N
    Dimension calificaciones[N], frecuencias[N]
    
    Escribir "Ingrese las calificaciones:"
    Para i <- 0 Hasta N - 1 Hacer
        Leer calificaciones[i]
        frecuencias[i] <- 0
    FinPara
    
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta N - 1 Hacer
            Si calificaciones[i] = calificaciones[j] Entonces
                frecuencias[i] <- frecuencias[i] + 1
            FinSi
        FinPara
    FinPara
    
    maxFrecuencia <- 0
    moda <- calificaciones[0]
    
    Para i <- 0 Hasta N - 1 Hacer
        Si frecuencias[i] > maxFrecuencia Entonces
            maxFrecuencia <- frecuencias[i]
            moda <- calificaciones[i]
        FinSi
    FinPara
    
    Escribir "La moda es:", moda
    Escribir "Distribución de calificaciones:"
    
    Para i <- 0 Hasta N - 1 Hacer
        Si frecuencias[i] > 0 Entonces
            Escribir "Calificación ", calificaciones[i], " aparece ", frecuencias[i], " veces."
        FinSi
    FinPara
FinProceso
