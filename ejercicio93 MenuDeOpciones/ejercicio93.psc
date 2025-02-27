Algoritmo MenuDeOpciones
    Definir Opcion Como Entero
    Repetir
        Escribir "Menú de Opciones:"
        Escribir "1. Realizar tarea 1"
        Escribir "2. Realizar tarea 2"
        Escribir "3. Salir"
        Escribir "Elige una opción:"
        Leer Opcion
        Según Opcion Hacer
	Caso 1:
		Escribir "Realizando tarea 1"
	Caso 2:
		Escribir "Realizando tarea 2"
	Caso 3:
		Escribir "Saliendo del programa..."
	De Otro Modo:
		Escribir "Opción inválida, intente de nuevo"
Fin Según
Hasta Que Opcion = 3
FinAlgoritmo
