edad = int(input("Introduce tu edad: "))

while edad < 0 or edad > 120:
    print("Edad inválida. Por favor, ingresa una edad entre 0 y 120.")
    edad = int(input("Introduce tu edad: "))

print("Edad válida.")
