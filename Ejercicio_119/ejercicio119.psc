Algoritmo CalcularPropina
    Definir monto_cuenta, porcentaje_propina, propina, total_cuenta Como Real
	
    Escribir "Ingrese el monto de la cuenta:"
    Leer monto_cuenta
	
    Escribir "Ingrese el porcentaje de propina:"
    Leer porcentaje_propina
	
    propina <- monto_cuenta * (porcentaje_propina / 100)
    total_cuenta <- monto_cuenta + propina
	
    Escribir "El monto de la propina es:", propina
    Escribir "El total a pagar es:", total_cuenta
FinAlgoritmo
