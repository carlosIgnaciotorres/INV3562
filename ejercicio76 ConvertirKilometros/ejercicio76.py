def convertir_km(km):
    metros = km * 1000
    centimetros = km * 100000
    return metros, centimetros

km = float(input("Ingresa la cantidad de kilómetros: "))
metros, centimetros = convertir_km(km)
print(f"{km} kilómetros son {metros} metros y {centimetros} centímetros.")
