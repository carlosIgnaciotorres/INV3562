suma = 0
for i in range(15):
    numero = int(input("Ingresar número: "))
    if numero % 3 == 0:
        suma += numero
print("La suma de los múltiplos de 3 es:", suma)
