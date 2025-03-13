import math

base = float(input("Ingrese la base del rectángulo: "))
altura = float(input("Ingrese la altura del rectángulo: "))

diagonal = math.sqrt(base**2 + altura**2)

print(f"La diagonal del rectángulo es: {diagonal}")
