import math

x1 = float(input("Ingresa x1: "))
y1 = float(input("Ingresa y1: "))
x2 = float(input("Ingresa x2: "))
y2 = float(input("Ingresa y2: "))

diferencia_x = x2 - x1
diferencia_y = y2 - y1

distancia = math.sqrt(diferencia_x**2 + diferencia_y**2)

print("La distancia entre los puntos es:", distancia)