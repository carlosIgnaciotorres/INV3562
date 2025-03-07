def decimal_a_binario(numero):
    if numero == 0:
        return "0"
    
    binario = ""
    while numero > 0:
        residuo = numero % 2
        binario = str(residuo) + binario
        numero //= 2
    
    return binario

# Prueba
numero = int(input("Ingrese un número decimal: "))
print(f"El número binario es: {decimal_a_binario(numero)}")
