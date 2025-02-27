contraseña = input("Ingresa una contraseña: ")
longitud = len(contraseña)

if longitud >= 8:
    print("Contraseña válida")
else:
    print("Contraseña inválida")