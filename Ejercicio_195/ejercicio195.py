import math

def calcular_distancia(x1, y1, x2, y2):
    return math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

x1, y1 = map(float, input("Ingrese x1 y y1: ").split())
x2, y2 = map(float, input("Ingrese x2 y y2: ").split())

print("La distancia entre los puntos es:", calcular_distancia(x1, y1, x2, y2))
