import random

lista = [random.randint(1, 100) for _ in range(20)]
lista.sort()

if len(lista) % 2 == 0:
    mediana = (lista[9] + lista[10]) / 2
else:
    mediana = lista[10]

print("Lista ordenada:", lista)
print("La mediana de los números generados es:", mediana)
