L = float(input("Ingresa el flujo de la manguera en litros por minuto: "))
capacidad_en_litros = 50 * 1000
tiempo_en_minutos = capacidad_en_litros / L
tiempo_en_horas = tiempo_en_minutos / 60
print(f"El tiempo en minutos es: {tiempo_en_minutos:.2f}")
print(f"El tiempo en horas es: {tiempo_en_horas:.2f}")
