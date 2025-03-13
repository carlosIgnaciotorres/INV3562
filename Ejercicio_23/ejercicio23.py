def comparar_iniciales():
    nombre1 = input("Ingrese el primer nombre: ")
    nombre2 = input("Ingrese el segundo nombre: ")

    if len(nombre1) > 0 and len(nombre2) > 0:
        inicial1 = nombre1[0]
        inicial2 = nombre2[0]

        if inicial1 == inicial2:
            print("Los nombres tienen la misma inicial")
        else:
            print("Los nombres no tienen la misma inicial")
    else:
        print("Error: Uno o ambos nombres están vacíos")

comparar_iniciales()
