Algoritmo DiferenciaEnDias
    Definir dia1, mes1, anio1, dia2, mes2, anio2 Como Entero
    Definir dias1, dias2, diferencia Como Entero
	
    Escribir "Ingrese la primera fecha:"
    Escribir "Día:"
    Leer dia1
    Escribir "Mes:"
    Leer mes1
    Escribir "Año:"
    Leer anio1
	
    Escribir "Ingrese la segunda fecha:"
    Escribir "Día:"
    Leer dia2
    Escribir "Mes:"
    Leer mes2
    Escribir "Año:"
    Leer anio2
	
    dias1 <- anio1 * 365 + (mes1 - 1) * 30 + dia1
    dias2 <- anio2 * 365 + (mes2 - 1) * 30 + dia2
	
    diferencia <- Abs(dias2 - dias1)
	
    Escribir "La diferencia en días entre las dos fechas es:", diferencia
FinAlgoritmo
