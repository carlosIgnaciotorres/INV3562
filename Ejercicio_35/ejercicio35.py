
numero1 = float(input("Ingrese el primer número: "))
numero2 = float(input("Ingrese el segundo número: "))


if numero1 > numero2:
    resultado = numero1 / numero2
elif numero2 > numero1:
    resultado = numero2 / numero1
else:
    resultado = 1  


print("El resultado de la división del número mayor entre el número menor es:", resultado)
