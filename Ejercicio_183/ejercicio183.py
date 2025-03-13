N = int(input("Ingrese un número N: "))
print(f"Números primos entre 1 y {N}: ", end="")

for X in range(2, N + 1):
    contador = 0
    for i in range(1, X + 1):
        if X % i == 0:
            contador += 1
    if contador == 2:
        print(X, end=" ")
