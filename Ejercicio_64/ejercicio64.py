numero1 = int(input("Ingrese el primer número (dividendo): "))
numero2 = int(input("Ingrese el segundo número (divisor): "))

if numero2 == 0:
    print("Error: No se puede dividir entre 0.")
else:
    residuo = numero1 % numero2
    if residuo == 0:
        print(f"El número {numero1} es divisible por {numero2}.")
    else:
        print(f"El número {numero1} no es divisible por {numero2}.")
