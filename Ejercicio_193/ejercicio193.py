from collections import Counter

def encontrar_moda(lista):
    conteo = Counter(lista)  # Contar ocurrencias
    moda = max(conteo, key=conteo.get)  # Encontrar el número más repetido
    return moda

# Entrada de datos
N = int(input("Ingrese la cantidad de números (N): "))
lista = []

for i in range(N):
    num = int(input(f"Ingrese el número {i+1}: "))
    lista.append(num)

# Encontrar y mostrar la moda
moda = encontrar_moda(lista)
print(f"La moda es: {moda}")
