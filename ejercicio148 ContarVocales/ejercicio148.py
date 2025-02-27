palabra = input("Ingresa una palabra: ")
contador = 0

for letra in palabra:
    if letra in "aeiou":
        contador += 1

print("El número de vocales es:", contador)