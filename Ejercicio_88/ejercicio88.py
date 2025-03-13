monto_invertido = float(input("Ingresa el monto invertido: "))
tasa_interes = float(input("Ingresa la tasa de interés (%): "))
intereses = monto_invertido * (tasa_interes / 100)
if intereses > 7000:
    monto_final = monto_invertido + intereses
else:
    monto_final = monto_invertido
print(f"Los intereses generados son: {intereses:.2f}")
print(f"El monto final en la cuenta es: {monto_final:.2f}")
