num1 = float(input("Ingrese el primer número: "))
num2 = float(input("Ingrese el segundo número: "))

suma = num1 + num2
resta = num1 - num2
multiplicacion = num1 * num2

print("Suma:", suma)
print("Resta:", resta)
print("Multiplicación:", multiplicacion)

if num2 != 0:
    division = num1 / num2
    print("División:", division)
else:
    print("Error: No se puede dividir por cero")
