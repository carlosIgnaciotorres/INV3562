año = int(input("Ingrese un año: "))

if (año % 400 == 0) or ((año % 4 == 0) and (año % 100 != 0)):
    print("El año es bisiesto")
else:
    print("El año NO es bisiesto")
