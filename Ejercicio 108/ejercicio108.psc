Algoritmo MenuConValidacion
    Definir opcion Como Entero
	
    Hacer
        Escribir "Men� de opciones: "
        Escribir "1. Opci�n 1"
        Escribir "2. Opci�n 2"
        Escribir "3. Opci�n 3"
        Escribir "4. Opci�n 4"
        Escribir "5. Opci�n 5"
        Escribir "Selecciona una opci�n (1-5): "
        Leer opcion
		
        Si opcion >= 1 Y opcion <= 5 Entonces
            Escribir "Opci�n seleccionada: ", opcion
        Sino
            Escribir "Opci�n inv�lida. Por favor, selecciona una opci�n entre 1 y 5."
        Fin Si
		Mientras opcion < 1 O opcion > 5
FinAlgoritmo
