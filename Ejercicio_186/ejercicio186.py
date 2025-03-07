P = [1, 1, 1] + [0] * 7

for i in range(3, 10):
    P[i] = P[i - 2] + P[i - 3]

print("Los primeros 10 números de la sucesión de Padovan son:", *P)
