N = int(input("Ingrese el número de filas de la primera matriz (N): "))
M = int(input("Ingrese el número de columnas de la primera matriz / filas de la segunda matriz (M): "))
P = int(input("Ingrese el número de columnas de la segunda matriz (P): "))

A = [[int(input()) for _ in range(M)] for _ in range(N)]
B = [[int(input()) for _ in range(P)] for _ in range(M)]
C = [[sum(A[i][k] * B[k][j] for k in range(M)) for j in range(P)] for i in range(N)]

print("La matriz resultante es:")
for fila in C:
    print(*fila)
