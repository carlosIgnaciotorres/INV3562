def contar_caracteres_especiales(texto):
    return sum(1 for c in texto if not c.isalnum() and not c.isspace())

texto = input("Ingrese un texto: ")
print("Cantidad de caracteres especiales:", contar_caracteres_especiales(texto))
