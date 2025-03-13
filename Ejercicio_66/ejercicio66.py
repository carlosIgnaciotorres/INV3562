N = int(input("Ingrese la cantidad de números a sumar (N): "))

suma = 0
contador = 1
excedido = False

while contador <= N and not excedido:
    numero = int(input(f"Ingrese el número {contador}: "))
    suma += numero

    if suma > 1000:
        print(f"El número que excedió el límite fue: {numero}")
        excedido = True
    
    contador += 1

if not excedido:
    print(f"La suma total es: {suma}")
