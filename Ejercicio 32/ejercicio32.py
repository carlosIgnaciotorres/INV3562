
numero = int(input("Ingrese un número entero positivo de 3 cifras: "))

centenas = numero // 100
decenas = (numero % 100) // 10
unidades = numero % 10

suma = centenas + decenas + unidades

print("La suma de los dígitos es:", suma)
