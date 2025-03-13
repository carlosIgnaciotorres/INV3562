Algoritmo SimularCola
    Definir opcion, num_personas Como Entero
    Definir cola Como Cola
    cola.CrearCola()
	
    Repetir
        Escribir "Seleccione una opción:"
        Escribir "1. Agregar persona a la fila"
        Escribir "2. Sacar persona de la fila"
        Escribir "3. Terminar"
        Leer opcion
        
        // Procesar la opción elegida
        Segun opcion Hacer
            1:
                cola.Acolar(1)  // Asumiendo que '1' representa una persona
                Escribir "Una persona ha sido añadida a la fila."
                
            2:
                Si cola.EstaVacia() Entonces
                    Escribir "La fila está vacía. No hay nadie para sacar."
                Sino
                    cola.Desacolar()
                    Escribir "Una persona ha sido sacada de la fila."
                FinSi
                
            3:
                Escribir "Finalizando el programa..."
                
            De Otro Modo:
                Escribir "Opción no válida. Intente de nuevo."
        FinSegun
    Hasta Que opcion = 3
    
    num_personas <- cola.Longitud()
    Escribir "Personas en la fila: ", num_personas
FinAlgoritmo
