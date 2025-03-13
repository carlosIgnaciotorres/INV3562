a = float(input("Ingrese el primer término (a): "))
r = float(input("Ingrese la razón (r): "))
n = int(input("Ingrese el número de términos (n): "))

suma = sum(a * r**i for i in range(n))

print("La suma de la serie geométrica es:", suma)
