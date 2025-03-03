articulo = input("Ingresa el nombre del artículo: ")
stock = int(input("Ingresa la cantidad inicial de stock: "))

while True:
    print("Opciones:")
    print("1. Registrar venta")
    print("2. Registrar compra")
    print("3. Salir")
    opcion = int(input("Elige una opción: "))

    if opcion == 1:
        cantidad = int(input("Ingresa la cantidad vendida: "))
        if cantidad <= stock:
            stock -= cantidad
        else:
            print("No hay suficiente stock.")
    elif opcion == 2:
        cantidad = int(input("Ingresa la cantidad comprada: "))
        stock += cantidad
    elif opcion == 3:
        print("Saliendo del sistema.")
        break
    else:
        print("Opción no válida.")

    print(f"Stock actual de {articulo}: {stock}")
