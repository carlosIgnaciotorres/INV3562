def diferencia_mayor_menor(lista):
    return max(lista), min(lista), max(lista) - min(lista)

N = int(input("Ingrese la cantidad de números (N): "))
lista = [int(input(f"Ingrese el número {i+1}: ")) for i in range(N)]

mayor, menor, diferencia = diferencia_mayor_menor(lista)

print(f"El número mayor es: {mayor}")
print(f"El número menor es: {menor}")
print(f"La diferencia entre el mayor y el menor es: {diferencia}")
