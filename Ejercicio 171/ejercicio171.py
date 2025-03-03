import math

def calcular_volumen_cilindro(radio, altura):
    return math.pi * (radio ** 2) * altura

radio = float(input("Ingrese el radio del cilindro: "))
altura = float(input("Ingrese la altura del cilindro: "))

volumen = calcular_volumen_cilindro(radio, altura)

print(f"El volumen del cilindro es: {volumen:.2f}")
