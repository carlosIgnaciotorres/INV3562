import math

a = float(input("Introduce el valor de a: "))
b = float(input("Introduce el valor de b: "))
c = float(input("Introduce el valor de c: "))

D = b * b - 4 * a * c

if D >= 0:
    raiz_D = math.sqrt(D)
    x1 = (-b + raiz_D) / (2 * a)
    x2 = (-b - raiz_D) / (2 * a)
    print("Las soluciones son: x1 =", x1, "y x2 =", x2)
else:
    print("No hay soluciones reales.")
