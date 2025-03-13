import random

N = int(input("Ingrese la cantidad de lanzamientos: "))
dobles = 0

for _ in range(N):
    dado1 = random.randint(1, 6)
    dado2 = random.randint(1, 6)
    if dado1 == dado2:
        dobles += 1

print("Cantidad de dobles obtenidos:", dobles)
