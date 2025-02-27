aciertos = 0
total_preguntas = 3
pregunta_actual = 1

while pregunta_actual <= total_preguntas:
    respuesta = input(f"Pregunta {pregunta_actual}: ¿Sí o No? ")

    if respuesta == "sí" or respuesta == "no":
        aciertos += 1

    pregunta_actual += 1

print(f"Total de aciertos: {aciertos}")
