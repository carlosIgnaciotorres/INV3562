def comparar_longitudes():
    nombre1 = input("Ingrese el primer nombre: ")
    nombre2 = input("Ingrese el segundo nombre: ")

    longitud1 = len(nombre1)
    longitud2 = len(nombre2)

    if longitud1 > longitud2:
        print("El primer nombre tiene más caracteres.")
    elif longitud1 == longitud2:
        print("Ambos nombres tienen la misma cantidad de caracteres.")
    else:
        print("El segundo nombre tiene más caracteres.")

comparar_longitudes()
