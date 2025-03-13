N = int(input("Ingrese el tamaño de la matriz cuadrada (N x N): "))

A = [[int(input()) for _ in range(N)] for _ in range(N)]
simetrica = all(A[i][j] == A[j][i] for i in range(N) for j in range(i + 1, N))

print("La matriz es simétrica." if simetrica else "La matriz no es simétrica.")
