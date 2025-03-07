n = int(input("Por favor, ingresa un número entero positivo: "))

if n <= 0:
    print("Error: el número debe ser positivo.")
else:
    print("Múltiplos de 3 desde 1 hasta", n, ":")
    contador = 1
    while contador <= n:
        if contador % 3 == 0:
            print(contador)
        contador += 1
