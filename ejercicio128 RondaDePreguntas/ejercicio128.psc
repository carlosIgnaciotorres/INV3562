Algoritmo RondaDePreguntas
    Definir aciertos, pregunta_actual, total_preguntas Como Entero
    Definir respuesta Como Cadena
	
    aciertos <- 0
    total_preguntas <- 3  // N�mero de preguntas
    pregunta_actual <- 1
	
    Mientras pregunta_actual <= total_preguntas Hacer
        Escribir "Pregunta ", pregunta_actual, ": �S� o No?"
        Leer respuesta
		
        Si respuesta == "s�" O respuesta == "no" Entonces
            aciertos <- aciertos + 1
        Fin Si
		
        pregunta_actual <- pregunta_actual + 1
    Fin Mientras
	
    Escribir "Total de aciertos: ", aciertos
FinAlgoritmo
