N = int(input("Ingrese la cantidad de números: "))
lista = [int(input("Ingrese un número: ")) for _ in range(N)]

for i in range(N - 1):
    for j in range(N - i - 1):
        if lista[j] > lista[j + 1]:
            lista[j], lista[j + 1] = lista[j + 1], lista[j]

print("Lista ordenada:", lista)
