Proceso CompararEdadesHermanos
    Definir EdadHermano1, EdadHermano2, Diferencia Como Entero
	
    Escribir "Ingrese la edad del primer hermano: "
    Leer EdadHermano1
    Escribir "Ingrese la edad del segundo hermano: "
    Leer EdadHermano2
	
    Si EdadHermano1 > EdadHermano2 Entonces
        Diferencia = EdadHermano1 - EdadHermano2
        Escribir "El hermano mayor tiene ", EdadHermano1, " a�os."
        Escribir "La diferencia de edad es de ", Diferencia, " a�os."
    Sino
        Si EdadHermano2 > EdadHermano1 Entonces
            Diferencia = EdadHermano2 - EdadHermano1
            Escribir "El hermano mayor tiene ", EdadHermano2, " a�os."
            Escribir "La diferencia de edad es de ", Diferencia, " a�os."
        Sino
            Escribir "Ambos hermanos tienen la misma edad."
        FinSi
    FinSi
FinProceso
