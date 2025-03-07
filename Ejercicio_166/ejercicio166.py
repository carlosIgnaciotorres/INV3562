def calcular_perimetro(n, l):
    return n * l

n = int(input("Ingrese el número de lados del polígono: "))
l = float(input("Ingrese la longitud de un lado: "))

perimetro = calcular_perimetro(n, l)
print(f"El perímetro del polígono es: {perimetro}")
