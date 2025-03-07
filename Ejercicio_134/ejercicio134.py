def main():
    pila = []

    while True:
        print("1. Apilar elemento")
        print("2. Desapilar elemento")
        print("3. Terminar")
        opcion = int(input("Seleccione una opción: "))

        if opcion == 1:
            elemento = int(input("Introduce el elemento a apilar: "))
            pila.append(elemento)
        elif opcion == 2:
            if pila:
                print("Elemento desapilado: ", pila.pop())
            else:
                print("Pila vacía")
        elif opcion == 3:
            print("Terminando programa...")
            break
        else:
            print("Opción no válida.")
    
    print("Estado final de la pila:")
    for elemento in pila:
        print(elemento)

if __name__ == "__main__":
    main()
