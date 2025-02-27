def es_numero_perfecto(n):
    suma = 0
    for i in range(1, n):
        if n % i == 0:
            suma += i
    if suma == n:
        print(f"El número {n} es perfecto.")
    else:
        print(f"El número {n} no es perfecto.")

# Ejecución
n = int(input("Ingrese un número entero positivo: "))
es_numero_perfecto(n)
