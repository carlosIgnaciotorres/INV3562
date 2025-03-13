import math

L = float(input("Ingrese la longitud del lado del pentágono: "))

perimetro = 5 * L
apotema = L / (2 * math.tan(math.radians(36)))
area = (perimetro * apotema) / 2

print("El perímetro es:", perimetro)
print("El área es:", area)
