Algoritmo CalcularTotalCompraCamisas
    Escribir "Ingresa la cantidad de camisas: "
    Leer CantidadCamisas
    Escribir "Ingresa el precio unitario de cada camisa: "
    Leer PrecioUnitario
    PrecioTotal <- CantidadCamisas * PrecioUnitario
    Si CantidadCamisas >= 3 Entonces
        Descuento <- PrecioTotal * 0.20
    SiNo
        Descuento <- PrecioTotal * 0.10
    FinSi
    TotalAPagar <- PrecioTotal - Descuento
    Escribir "El total a pagar es: ", TotalAPagar
FinAlgoritmo
