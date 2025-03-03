import math

A = float(input("Ingresa el valor de A (lado menor): "))
B = float(input("Ingresa el valor de B (lado medio): "))
C = float(input("Ingresa el valor de C (lado mayor): "))

if A + B > C:
    if A == B and B == C:
        tipo = "Equilátero"
    elif A == B or B == C or A == C:
        tipo = "Isósceles"
    else:
        tipo = "Escaleno"
    s = (A + B + C) / 2
    area = math.sqrt(s * (s - A) * (s - B) * (s - C))
    print(f"El triángulo es: {tipo}")
    print(f"El área del triángulo es: {area:.2f}")
else:
    print("No es un triángulo válido.")
