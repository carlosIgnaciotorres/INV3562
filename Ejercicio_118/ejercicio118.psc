Algoritmo CalculadoraDescuento
    Definir monto_compra, monto_descuento, monto_total, porcentaje_descuento Como Real
    Definir tipo_cliente Como Cadena
	
    Escribir "Ingrese el monto de la compra:"
    Leer monto_compra
	
    Escribir "Ingrese el tipo de cliente (Regular, Preferencial, Premium):"
    Leer tipo_cliente
	
    Si tipo_cliente = "Regular" Entonces
        porcentaje_descuento <- 5
    Sino
        Si tipo_cliente = "Preferencial" Entonces
            porcentaje_descuento <- 10
        Sino
            Si tipo_cliente = "Premium" Entonces
                porcentaje_descuento <- 20
            Sino
                porcentaje_descuento <- 0
            FinSi
        FinSi
    FinSi
	
    monto_descuento <- monto_compra * (porcentaje_descuento / 100)
    monto_total <- monto_compra - monto_descuento
	
    Escribir "El monto del descuento es:", monto_descuento
    Escribir "El monto total a pagar es:", monto_total
FinAlgoritmo
