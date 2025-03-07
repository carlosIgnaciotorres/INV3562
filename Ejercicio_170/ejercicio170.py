def es_palindromo(texto):
    texto_limpio = ''.join(c.lower() for c in texto if c.isalnum())
    return texto_limpio == texto_limpio[::-1]

texto = input("Ingrese un texto: ")
if es_palindromo(texto):
    print("Es un palíndromo.")
else:
    print("No es un palíndromo.")
