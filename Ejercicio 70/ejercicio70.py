pares = 0
impares = 0
ceros = 0
contador = 1

while contador <= 10:
    numero = int(input("Introduce un número: "))

    if numero == 0:
        ceros += 1
    elif numero % 2 == 0:
        pares += 1
    else:
        impares += 1

    contador += 1

print("Pares =", pares)
print("Impares =", impares)
print("Ceros =", ceros)
