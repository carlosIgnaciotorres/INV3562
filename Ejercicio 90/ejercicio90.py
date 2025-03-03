anio1 = int(input("Ingresa el primer año: "))
anio2 = int(input("Ingresa el segundo año: "))
if anio1 > anio2:
    meses = (anio1 - anio2) * 12
else:
    meses = (anio2 - anio1) * 12
print(f"Los meses transcurridos entre los inicios de los dos años son: {meses}")
