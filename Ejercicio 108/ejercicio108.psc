Algoritmo MenuConValidacion
    Definir opcion Como Entero
	
    Hacer
        Escribir "Menú de opciones: "
        Escribir "1. Opción 1"
        Escribir "2. Opción 2"
        Escribir "3. Opción 3"
        Escribir "4. Opción 4"
        Escribir "5. Opción 5"
        Escribir "Selecciona una opción (1-5): "
        Leer opcion
		
        Si opcion >= 1 Y opcion <= 5 Entonces
            Escribir "Opción seleccionada: ", opcion
        Sino
            Escribir "Opción inválida. Por favor, selecciona una opción entre 1 y 5."
        Fin Si
		Mientras opcion < 1 O opcion > 5
FinAlgoritmo
