Algoritmo VentaZapatos
    Leer Nombre
    Leer CostoSandalias, CostoTenis, CostoMocasines
    Leer CantidadSandalias, CantidadTenis, CantidadMocasines
    PrecioSandalias <- CostoSandalias * 1.55
    PrecioTenis <- CostoTenis * 1.55
    PrecioMocasines <- CostoMocasines * 1.55
    ValorSinDescuento <- (CantidadSandalias * PrecioSandalias) + (CantidadTenis * PrecioTenis) + (CantidadMocasines * PrecioMocasines)
    Descuento <- ValorSinDescuento * 0.08
    ValorConDescuento <- ValorSinDescuento - Descuento
    VentaNetaFinal <- ValorConDescuento * 1.16
    Escribir "Nombre del cliente: ", Nombre
    Escribir "Valor sin descuento: ", ValorSinDescuento
    Escribir "Descuento: ", Descuento
    Escribir "Valor con descuento: ", ValorConDescuento
    Escribir "Venta neta final: ", VentaNetaFinal
FinAlgoritmo
