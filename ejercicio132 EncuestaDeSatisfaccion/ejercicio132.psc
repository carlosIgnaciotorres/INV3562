Algoritmo EncuestaDeSatisfaccion
    Definir calificacion, suma_calificaciones, contador_respuestas Como Entero
    Definir respuesta Como Caracter
    suma_calificaciones <- 0
    contador_respuestas <- 0
	
    Repetir
        Escribir "Ingresa tu calificaci�n (1-5):"
        Leer calificacion
        Si calificacion >= 1 Y calificacion <= 5 Entonces
            suma_calificaciones <- suma_calificaciones + calificacion
            contador_respuestas <- contador_respuestas + 1
        Sino
            Escribir "Calificaci�n inv�lida, debe ser entre 1 y 5."
        FinSi
        
        Escribir "�Deseas ingresar otra calificaci�n? (s/n):"
        Leer respuesta
    Hasta Que respuesta <> "s"
    
    Si contador_respuestas > 0 Entonces
        Escribir "El promedio de satisfacci�n es: ", suma_calificaciones / contador_respuestas
    Sino
        Escribir "No se ingresaron calificaciones v�lidas."
    FinSi
FinAlgoritmo
