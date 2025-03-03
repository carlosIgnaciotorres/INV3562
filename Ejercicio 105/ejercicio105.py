dato_correcto = "valorEsperado"
intentos = 0

while intentos < 3:
    dato_usuario = input("Introduce el dato: ")
    
    if dato_usuario == dato_correcto:
        print("Dato correcto ingresado.")
        break
    else:
        intentos += 1
        if intentos < 3:
            print(f"Intento {intentos} fallido. Intenta de nuevo.")
        else:
            print("Has agotado los 3 intentos. Acceso denegado.")
