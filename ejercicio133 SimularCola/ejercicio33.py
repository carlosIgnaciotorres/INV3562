def main():
    cola = []
    while True:
        print("1. Agregar persona a la fila")
        print("2. Sacar persona de la fila")
        print("3. Terminar")
        opcion = int(input("Seleccione una opción: "))

        if opcion == 1:
            cola.append("Persona")  # Simulamos añadir una persona
            print("Una persona ha sido añadida a la fila.")
        elif opcion == 2:
            if cola:
                cola.pop(0)
                print("Una persona ha sido sacada de la fila.")
            else:
                print("La fila está vacía. No hay nadie para sacar.")
        elif opcion == 3:
            print("Finalizando el programa...")
            break
        else:
            print("Opción no válida. Intente de nuevo.")
    
    print("Personas en la fila:", len(cola))

if __name__ == "__main__":
    main()
