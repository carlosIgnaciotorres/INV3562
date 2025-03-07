import math

numero = int(input("Ingresa un número: "))
raiz = math.sqrt(numero)
raiz_redondeada = round(raiz)

if raiz_redondeada * raiz_redondeada == numero:
    print("Es un cuadrado perfecto")
else:
    print("No es un cuadrado perfecto")