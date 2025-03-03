import math


cateto1 = float(input("Ingrese el valor del primer cateto: "))
cateto2 = float(input("Ingrese el valor del segundo cateto: "))


cuadrado1 = cateto1 * cateto1
cuadrado2 = cateto2 * cateto2
suma_cuadrados = cuadrado1 + cuadrado2
hipotenusa = math.sqrt(suma_cuadrados)


print("La hipotenusa del triángulo es:", hipotenusa)
