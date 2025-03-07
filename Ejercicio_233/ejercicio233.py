N = int(input("Ingrese la altura del triángulo de Pascal (N): "))

pascal = [[1 if j == 0 or j == i else 0 for j in range(i + 1)] for i in range(N)]

for i in range(2, N):
    for j in range(1, i):
        pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]

print("Triángulo de Pascal:")
for fila in pascal:
    print(*fila)
