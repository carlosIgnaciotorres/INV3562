Algoritmo CompararEdadesHermanos
    Escribir "Ingresa la edad del primer hermano: "
    Leer EdadHermano1
    Escribir "Ingresa la edad del segundo hermano: "
    Leer EdadHermano2
	
    Si EdadHermano1 > EdadHermano2 Entonces
        Mayor <- EdadHermano1
        Menor <- EdadHermano2
    SiNo
        Mayor <- EdadHermano2
        Menor <- EdadHermano1
    FinSi
	
    Diferencia <- Mayor - Menor
	
    Escribir "El hermano mayor tiene: ", Mayor, " a�os."
    Escribir "La diferencia de edades es de: ", Diferencia, " a�os."
FinAlgoritmo
