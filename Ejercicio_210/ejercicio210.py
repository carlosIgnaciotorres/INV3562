N = int(input("Ingrese la altura de la pirámide: "))

for i in range(1, N + 1):
    print(" " * (N - i), end="")
    for j in range(1, 2 * i):
        print(j, end=" ")
    print()
