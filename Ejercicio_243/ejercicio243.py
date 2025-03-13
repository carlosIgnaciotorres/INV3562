palabra1 = input("Ingrese la primera palabra: ")
palabra2 = input("Ingrese la segunda palabra: ")

contador = 0
for caracter in palabra1:
    if caracter in palabra2:
        contador += 1
        print(f"Caracter encontrado: {caracter} | Total: {contador}")

print(f"Número total de caracteres de la primera palabra que aparecen en la segunda: {contador}")
