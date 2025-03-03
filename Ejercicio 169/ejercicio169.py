def contar_palabras(frase):
    palabras = frase.strip().split()
    return len(palabras)

frase = input("Ingrese una frase: ")
print("Cantidad de palabras en la frase:", contar_palabras(frase))
