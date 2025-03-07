peso = float(input("Ingrese su peso en kilogramos: "))
altura = float(input("Ingrese su altura en metros: "))

imc = peso / (altura ** 2)

if imc < 18.5:
    estado = "Bajo peso"
elif imc <= 24.9:
    estado = "Normal"
else:
    estado = "Sobrepeso"

print("Su IMC es:", imc)
print("Estado:", estado)
