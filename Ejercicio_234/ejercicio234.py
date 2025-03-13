from collections import Counter

N = int(input("Ingrese la cantidad de números: "))
lista = [int(input("Ingrese un número: ")) for _ in range(N)]

frecuencia = Counter(lista)
numero_frecuente = max(frecuencia, key=frecuencia.get)

print("El número más frecuente es:", numero_frecuente)
