N = int(input("Ingrese la cantidad de elementos en las listas: "))

lista1 = [int(input("Ingrese un número para la primera lista: ")) for _ in range(N)]
lista2 = [int(input("Ingrese un número para la segunda lista: ")) for _ in range(N)]

if sorted(lista1) == sorted(lista2):
    print("Las listas son iguales sin importar el orden.")
else:
    print("Las listas no son iguales.")
