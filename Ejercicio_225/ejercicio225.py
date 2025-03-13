N = int(input("Ingrese el número de filas (N): "))
M = int(input("Ingrese el número de columnas (M): "))

A = [[int(input()) for _ in range(M)] for _ in range(N)]
B = [[int(input()) for _ in range(M)] for _ in range(N)]
C = [[A[i][j] + B[i][j] for j in range(M)] for i in range(N)]

print("La matriz resultante es:")
for fila in C:
    print(*fila)
