Algoritmo DistanciaEntrePuntos
    Definir x1, y1, x2, y2 Como Real
    Definir diferencia_x, diferencia_y, distancia Como Real
    
    Escribir "Ingresa las coordenadas del primer punto (x1, y1):"
    Leer x1, y1
    
    Escribir "Ingresa las coordenadas del segundo punto (x2, y2):"
    Leer x2, y2
    
    diferencia_x = x2 - x1
    diferencia_y = y2 - y1
    
    distancia = rc((diferencia_x)^2 + (diferencia_y)^2)
    
    Escribir "La distancia entre los puntos es: ", distancia
FinAlgoritmo