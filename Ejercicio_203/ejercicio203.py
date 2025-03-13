N = int(input("Ingrese el número total de elementos (N): "))
K = int(input("Ingrese el número de elementos a tomar (K): "))

num = 1
den = 1

for i in range(K):
    num *= (N - i)
    den *= (i + 1)

print("Las combinaciones posibles son:", num // den)
