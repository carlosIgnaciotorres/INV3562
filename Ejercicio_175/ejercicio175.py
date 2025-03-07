def numero_cercano_media():
    numeros = []
    
    print("Ingrese 5 números:")
    for _ in range(5):
        numeros.append(float(input()))

    media = sum(numeros) / 5
    mas_cercano = min(numeros, key=lambda x: abs(x - media))
    
    print(f"La media es: {media}")
    print(f"El número más cercano a la media es: {mas_cercano}")

numero_cercano_media()
