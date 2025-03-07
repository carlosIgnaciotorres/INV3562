num = int(input("Ingrese un número: "))
contador_divisores = 0

for i in range(1, num + 1):
    if num % i == 0:
        contador_divisores += 1

print("Cantidad de divisores:", contador_divisores)
