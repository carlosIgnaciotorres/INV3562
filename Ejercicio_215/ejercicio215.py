N = int(input("Ingrese el tamaño de la tabla de multiplicar: "))

for i in range(1, N + 1):
    for j in range(1, N + 1):
        print(i * j, end="\t")
    print()
