N = int(input("Ingrese un número: "))

while N != 1:
    print(N, end=" ")
    N = N // 2 if N % 2 == 0 else 3 * N + 1

print(N)
