def calcular_area_trapecio(base_mayor, base_menor, altura):
    area = ((base_mayor + base_menor) * altura) / 2
    return area


base_mayor = float(input("Ingrese la longitud de la base mayor del trapecio: "))
base_menor = float(input("Ingrese la longitud de la base menor del trapecio: "))
altura = float(input("Ingrese la altura del trapecio: "))


area = calcular_area_trapecio(base_mayor, base_menor, altura)


print(f"El área del trapecio es: {area}")
