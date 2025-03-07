import random

N = int(input("Ingrese la cantidad de lanzamientos: "))
caras = sum(1 for _ in range(N) if random.randint(0, 1) == 1)

probabilidad = caras / N
print("La probabilidad de obtener cara es:", probabilidad)
