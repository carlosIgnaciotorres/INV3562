import math

cateto1 = float(input("Ingrese el valor del primer cateto: "))
cateto2 = float(input("Ingrese el valor del segundo cateto: "))

suma_cuadrados = (cateto1 ** 2) + (cateto2 ** 2)
hipotenusa = math.sqrt(suma_cuadrados)

print("La hipotenusa es:", hipotenusa)
