clave_establecida = "miClaveSecreta"
clave_usuario = input("Introduce la clave de acceso: ")

if clave_usuario == clave_establecida:
    print("Acceso concedido.")
else:
    print("Clave incorrecta.")
