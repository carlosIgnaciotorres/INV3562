while True:
    print("Menú de Opciones:")
    print("1. Realizar tarea 1")
    print("2. Realizar tarea 2")
    print("3. Salir")
    opcion = int(input("Elige una opción: "))
    if opcion == 1:
        print("Realizando tarea 1")
    elif opcion == 2:
        print("Realizando tarea 2")
    elif opcion == 3:
        print("Saliendo del programa...")
        break
    else:
        print("Opción inválida, intente de nuevo")
