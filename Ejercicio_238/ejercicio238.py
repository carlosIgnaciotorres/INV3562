import random


minimo = int(input("Ingrese el valor mínimo del rango: "))
maximo = int(input("Ingrese el valor máximo del rango: "))
cantidad = int(input("Ingrese cuántos números desea generar: "))


if cantidad > (maximo - minimo + 1):
    print("No se pueden generar más números únicos que el tamaño del rango.")
else:
    numeros = random.sample(range(minimo, maximo + 1), cantidad)
    print("Números generados sin repetir:", numeros)
