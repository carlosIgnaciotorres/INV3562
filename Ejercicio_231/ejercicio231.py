N = int(input("Ingrese la cantidad de números: "))
lista = [int(input("Ingrese un número: ")) for _ in range(N)]

indice = next((i for i, num in enumerate(lista) if num < 0), -1)

if indice == -1:
    print("No hay números negativos en la lista.")
else:
    print("El primer número negativo está en el índice:", indice)
