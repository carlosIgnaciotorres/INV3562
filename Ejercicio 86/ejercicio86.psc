Algoritmo CalcularMontoConDescuento
    Escribir "Ingresa el monto de la compra: "
    Leer MontoCompra
    Si MontoCompra > 1000 Entonces
        Descuento <- MontoCompra * 0.20
        MontoFinal <- MontoCompra - Descuento
    SiNo
        MontoFinal <- MontoCompra
    FinSi
    Escribir "El monto total a pagar es: ", MontoFinal
FinAlgoritmo
