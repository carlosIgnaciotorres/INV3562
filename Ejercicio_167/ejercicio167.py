def calcular_letra_dni(dni):
    letras = "TRWAGMYFPDXBNJZSQVHLCKE"
    return letras[dni % 23]

dni = int(input("Ingrese el número de DNI: "))

if dni < 0:
    print("El DNI no puede ser negativo.")
else:
    print(f"La letra del DNI es: {calcular_letra_dni(dni)}")
