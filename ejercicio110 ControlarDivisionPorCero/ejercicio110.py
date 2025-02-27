dividendo = float(input("Ingrese el dividendo: "))

while True:
    divisor = float(input("Ingrese el divisor (distinto de 0): "))
    if divisor != 0:
        break

resultado = dividendo / divisor
print("El resultado de la división es:", resultado)
