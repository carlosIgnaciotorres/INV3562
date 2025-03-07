N = int(input("Ingrese la cantidad de números a multiplicar: "))

multiplicador = 1
contador = 1

while contador <= N:
    numero = int(input("Ingrese un número: "))
    multiplicador *= numero
    contador += 1

print("El resultado de la multiplicación es:", multiplicador)
