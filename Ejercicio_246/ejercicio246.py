import random

minimo = int(input("Ingrese el valor mínimo: "))
maximo = int(input("Ingrese el valor máximo: "))

numero = random.randint(minimo, maximo)

print(f"Número generado: {numero}")

if numero % 2 == 0:
    print("El número es par.")
else:
    print("El número es impar.")
