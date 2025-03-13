N = int(input("Ingrese la cantidad de números: "))
contador_pares = 0

for _ in range(N):
    num = int(input("Ingrese un número: "))
    if num % 2 == 0:
        contador_pares += 1

print("Cantidad de números pares:", contador_pares)
