Proceso CalcularTotalConDescuento
    
    Definir totalCompra, montoDescuento, totalFinal Como Real
    Definir descuento Como Real
    descuento <- 15
    
    
    Escribir "Ingrese el total de la compra: "
    Leer totalCompra
    
    
    montoDescuento <- totalCompra * (descuento / 100)
    
    
    totalFinal <- totalCompra - montoDescuento
    
    
    Escribir "El total a pagar después del descuento del ", descuento, "% es: ", totalFinal
FinProceso

