numero1 = int(input("Ingresa el primer número (numero1): "))
numero2 = int(input("Ingresa el segundo número (numero2): "))

if numero1 > numero2:
    print("Error: el primer número debe ser menor o igual al segundo.")
else:
    contador = numero1
    while contador <= numero2:
        print(contador)
        contador += 1
