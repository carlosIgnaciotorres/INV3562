n = int(input("Ingresa el valor de n: "))
m = int(input("Ingresa el valor de m: "))

if n > m:
    print("Error: n debe ser menor o igual a m")
else:
    suma = 0
    contador = n
    while contador <= m:
        if contador % 2 == 0:
            suma += contador
        contador += 1
    print("La suma de los números pares en el rango es:", suma)
