N = int(input("Ingrese el valor de N: "))
suma_cuadrados = sum(i**2 for i in range(1, N + 1))
cuadrado_suma = sum(range(1, N + 1)) ** 2
diferencia = cuadrado_suma - suma_cuadrados

print("La diferencia es:", diferencia)
