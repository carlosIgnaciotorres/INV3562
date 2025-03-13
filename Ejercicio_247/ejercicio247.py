N = int(input("Ingrese la cantidad de números: "))

suma = 0

for _ in range(N):
    numero = float(input("Ingrese un número: "))
    suma += numero

promedio = suma / N
print(f"El promedio de los números ingresados es: {promedio}")
