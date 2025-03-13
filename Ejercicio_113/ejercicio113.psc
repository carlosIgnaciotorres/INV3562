Algoritmo CalcularCostoConIVA
    Definir valor_neto, porcentaje_iva, iva, costo_total Como Real
	
    Escribir "Ingrese el valor neto del producto:"
    Leer valor_neto
	
    Escribir "Ingrese el porcentaje de IVA:"
    Leer porcentaje_iva
	
    iva <- valor_neto * (porcentaje_iva / 100)
    costo_total <- valor_neto + iva
	
    Escribir "El costo total del producto es:", costo_total
FinAlgoritmo
