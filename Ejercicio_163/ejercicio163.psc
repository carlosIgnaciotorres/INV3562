Algoritmo DeterminarBeca
    Definir promedio Como Real
    Definir nivelSocioeconomico Como Cadena
    Definir beca Como Cadena
	
    Escribir "Ingrese el promedio del estudiante (0-10):"
    Leer promedio
    Escribir "Ingrese el nivel socioeconómico (bajo, medio, alto):"
    Leer nivelSocioeconomico
	
    Si promedio >= 9.0 Entonces
        beca <- "beca completa"
    Sino
        Si promedio >= 8.0 Y promedio <= 8.9 Entonces
            Si nivelSocioeconomico == "bajo" O nivelSocioeconomico == "medio" Entonces
                beca <- "beca parcial"
            Sino
                beca <- "ninguna beca"
            FinSi
        Sino
            beca <- "ninguna beca"
        FinSi
    FinSi
	
    Escribir "El estudiante recibe una ", beca
FinAlgoritmo