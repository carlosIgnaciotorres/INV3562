lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
valor_buscar = int(input("Introduce el valor a buscar: "))
contador = 0

for numero in lista:
    if numero == valor_buscar:
        contador += 1

if contador > 0:
    print(f"El valor se encontró {contador} veces.")
else:
    print("El valor no se encontró en la lista.")
