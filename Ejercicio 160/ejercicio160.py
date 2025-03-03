import math

N = int(input("Ingrese la cantidad de números: "))
numeros = []

for i in range(N):
    numero = int(input(f"Ingrese el número {i+1}: "))
    numeros.append(numero)

contador = 0

for numero in numeros:
    if numero < 2:
        continue
    es_primo = True
    for j in range(2, int(math.sqrt(numero)) + 1):
        if numero % j == 0:
            es_primo = False
            break
    if es_primo:
        contador += 1

print(f"La cantidad de números primos es: {contador}")