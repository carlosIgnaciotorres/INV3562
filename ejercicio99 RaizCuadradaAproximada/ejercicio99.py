def raiz_cuadrada_aproximada(numero):
    if numero >= 0:
        aproximacion = numero / 2
        precision = 0.0001

        while abs((aproximacion * aproximacion) - numero) > precision:
            aproximacion = (aproximacion + (numero / aproximacion)) / 2

        return aproximacion
    else:
        return "El número ingresado no es válido."

# Solicitar el número al usuario
numero = float(input("Ingrese un número: "))
resultado = raiz_cuadrada_aproximada(numero)

if isinstance(resultado, str):
    print(resultado)
else:
    print(f"La raíz cuadrada aproximada es: {resultado}")
