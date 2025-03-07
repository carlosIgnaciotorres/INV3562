while True:
    print("Menú de opciones:")
    print("1. Opción 1")
    print("2. Opción 2")
    print("3. Opción 3")
    print("4. Opción 4")
    print("5. Opción 5")
    
    opcion = int(input("Selecciona una opción (1-5): "))
    
    if 1 <= opcion <= 5:
        print(f"Opción seleccionada: {opcion}")
        break
    else:
        print("Opción inválida. Por favor, selecciona una opción entre 1 y 5.")
