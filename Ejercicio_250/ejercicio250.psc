Proceso TiendaSimulada
    Definir total, precio Como Real
    
    total <- 0
    
    Escribir "Ingrese el precio del producto (0 para finalizar):"
    Leer precio
    
    Mientras precio <> 0 Hacer
        total <- total + precio
        Escribir "Ingrese el precio del producto (0 para finalizar):"
        Leer precio
    FinMientras
    
    Escribir "El total a pagar es:", total
FinProceso
