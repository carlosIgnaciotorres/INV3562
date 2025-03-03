Algoritmo CalcularHipotenusa
    Definir cateto1, cateto2, suma_cuadrados, hipotenusa Como Real
    Escribir "Ingrese el valor del primer cateto: "
    Leer cateto1
    Escribir "Ingrese el valor del segundo cateto: "
    Leer cateto2
    suma_cuadrados <- (cateto1^2) + (cateto2^2)
    hipotenusa <- raiz(suma_cuadrados)
    Escribir "La hipotenusa es: ", hipotenusa
FinAlgoritmo
