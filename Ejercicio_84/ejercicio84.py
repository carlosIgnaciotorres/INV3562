peso = float(input("Ingresa tu peso en kilogramos (kg): "))
altura = float(input("Ingresa tu altura en metros (m): "))
imc = peso / (altura ** 2)
if imc < 18.5:
    estado = "Bajo peso"
elif imc <= 24.9:
    estado = "Peso normal"
elif imc <= 29.9:
    estado = "Sobrepeso"
else:
    estado = "Obesidad"
print(f"Tu IMC es: {imc:.2f}")
print(f"Tu estado es: {estado}")
