num = int(input("Ingrese un número entre 0 y 9: "))

if num == 0:
    letras = "cero"
elif num == 1:
    letras = "uno"
elif num == 2:
    letras = "dos"
elif num == 3:
    letras = "tres"
elif num == 4:
    letras = "cuatro"
elif num == 5:
    letras = "cinco"
elif num == 6:
    letras = "seis"
elif num == 7:
    letras = "siete"
elif num == 8:
    letras = "ocho"
elif num == 9:
    letras = "nueve"
else:
    letras = "El número está fuera del rango permitido"

print("El número en letras es:", letras)
