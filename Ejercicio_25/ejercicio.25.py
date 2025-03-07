def operacion_matematica():
    numero1 = float(input("Ingrese el primer número: "))
    numero2 = float(input("Ingrese el segundo número: "))
    operador = input("Ingrese el operador (+, -, *, /): ")

    if operador == "+":
        resultado = numero1 + numero2
    elif operador == "-":
        resultado = numero1 - numero2
    elif operador == "*":
        resultado = numero1 * numero2
    elif operador == "/":
        if numero2 != 0:
            resultado = numero1 / numero2
        else:
            print("Error: División por cero no permitida.")
            return
    else:
        print("Operador inválido.")
        return

    print("El resultado es:", resultado)

operacion_matematica()
