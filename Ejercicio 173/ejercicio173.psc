Proceso DiferenciaMinutos
    Definir h1, m1, h2, m2, minutos1, minutos2, diferencia Como Entero
    
    Escribir "Ingrese la primera hora (HH MM):"
    Leer h1, m1
    
    Escribir "Ingrese la segunda hora (HH MM):"
    Leer h2, m2
    
    minutos1 <- (h1 * 60) + m1
    minutos2 <- (h2 * 60) + m2
    
    diferencia <- Abs(minutos2 - minutos1)
    
    Escribir "La diferencia en minutos es: ", diferencia
FinProceso
