Funcion distancia <- CalcularDistancia(x1, y1, x2, y2)
    Definir distancia Como Real
    distancia <- raiz((x2 - x1)^2 + (y2 - y1)^2)
FinFuncion

Proceso Principal
    Definir x1, y1, x2, y2, resultado Como Real
    Escribir "Ingrese x1, y1:"
    Leer x1, y1
    Escribir "Ingrese x2, y2:"
    Leer x2, y2
    resultado <- CalcularDistancia(x1, y1, x2, y2)
    Escribir "La distancia entre los puntos es: ", resultado
FinProceso
