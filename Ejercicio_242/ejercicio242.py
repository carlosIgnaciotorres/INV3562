def generar_secuencia():
    X = int(input("Ingrese el número base (X): "))
    N = int(input("Ingrese el límite máximo (N): "))
    
    contador = 1
    
    while X * contador <= N:
        print(X * contador)
        contador += 1
    
    print("Secuencia generada correctamente.")

generar_secuencia()

