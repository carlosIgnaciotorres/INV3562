# Solicitar datos al usuario
peso = float(input("Ingrese su peso en kilogramos (kg): "))
altura = float(input("Ingrese su altura en metros (m): "))

# Calcular el IMC
imc = peso / (altura ** 2)

# Mostrar el resultado del IMC
print(f"Su Índice de Masa Corporal (IMC) es: {imc:.2f}")

# Determinar el rango de peso
if imc < 18.5:
    print("Usted está en el rango de BAJO PESO.")
elif 18.5 <= imc <= 24.9:
    print("Usted está en el rango de PESO NORMAL (saludable).")
elif 25.0 <= imc <= 29.9:
    print("Usted está en el rango de SOBREPESO.")
else:
    print("Usted está en el rango de OBESIDAD.")