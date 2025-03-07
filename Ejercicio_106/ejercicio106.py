email = input("Introduce el email: ")

if "@" in email and "." in email:
    print("Formato de email correcto.")
else:
    print("Formato de email incorrecto.")
