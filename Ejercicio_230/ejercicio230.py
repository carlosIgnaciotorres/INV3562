N = int(input("Ingrese la cantidad de números: "))
lista = [int(input("Ingrese un número: ")) for _ in range(N)]

creciente = all(lista[i] <= lista[i+1] for i in range(N-1))
decreciente = all(lista[i] >= lista[i+1] for i in range(N-1))

if creciente:
    print("La lista está ordenada de forma creciente.")
elif decreciente:
    print("La lista está ordenada de forma decreciente.")
else:
    print("La lista no está ordenada.")
