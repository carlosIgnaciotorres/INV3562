def main():
    suma_calificaciones = 0
    contador_respuestas = 0
    
    while True:
        try:
            calificacion = int(input("Ingresa tu calificación (1-5): "))
            if 1 <= calificacion <= 5:
                suma_calificaciones += calificacion
                contador_respuestas += 1
            else:
                print("Calificación inválida, debe ser entre 1 y 5.")
        except ValueError:
            print("Por favor, ingresa un número.")

        respuesta = input("¿Deseas ingresar otra calificación? (s/n): ").lower()
        if respuesta != 's':
            break

    if contador_respuestas > 0:
        promedio = suma_calificaciones / contador_respuestas
        print(f"El promedio de satisfacción es: {promedio}")
    else:
        print("No se ingresaron calificaciones válidas.")

if __name__ == "__main__":
    main()
