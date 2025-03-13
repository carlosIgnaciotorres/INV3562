def calcular_media_aritmetica(num1, num2, num3):
    media = (num1 + num2 + num3) / 3
    return media


numero1 = float(input("Ingrese el primer número: "))
numero2 = float(input("Ingrese el segundo número: "))
numero3 = float(input("Ingrese el tercer número: "))


media = calcular_media_aritmetica(numero1, numero2, numero3)


print(f"La media aritmética de los tres números es: {media}")
