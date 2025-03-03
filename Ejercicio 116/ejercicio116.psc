Algoritmo ConversionDivisas
    Definir monto_dolares, tipo_cambio, monto_pesos Como Real
	
    Escribir "Ingrese el monto en dólares:"
    Leer monto_dolares
	
    Escribir "Ingrese el tipo de cambio (cuántos pesos equivale un dólar):"
    Leer tipo_cambio
	
    monto_pesos <- monto_dolares * tipo_cambio
	
    Escribir "El monto equivalente en pesos es:", monto_pesos
FinAlgoritmo
