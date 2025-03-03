suma = 0
contador = 1

while contador <= 10:
    numero = int(input("Introduce un número: "))
    
    if numero % 2 != 0:
        suma += numero
    
    contador += 1

print("La suma de los números impares es:", suma)
