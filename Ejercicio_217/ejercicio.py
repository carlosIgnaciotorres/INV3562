N = int(input("Ingrese la cantidad de números: "))
lista = [float(input("Ingrese un número: ")) for _ in range(N)]
media = sum(lista) / N
contador = sum(1 for num in lista if num > media)
print("Cantidad de números mayores que la media:", contador)
