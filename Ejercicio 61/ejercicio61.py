n = int(input("Ingresa un número entero positivo: "))

if n < 0:
    print("Error: El número debe ser un entero positivo.")
else:
    factorial = 1
    contador = 1

    while contador <= n:
        factorial *= contador
        contador += 1

    print(f"El factorial de {n} es: {factorial}")
