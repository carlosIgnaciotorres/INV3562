Algoritmo CalcularTotalConDescuento
    Definir total_compra, descuento, total_pagar Como Real
    Escribir "Ingrese el total de la compra: "
    Leer total_compra
    descuento <- total_compra * 0.15
    total_pagar <- total_compra - descuento
    Escribir "El total a pagar después del descuento es: ", total_pagar
FinAlgoritmo
