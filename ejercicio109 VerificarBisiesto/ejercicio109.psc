Algoritmo VerificarBisiesto
    Definir año Como Entero
	
    Escribir "Ingrese un año:"
    Leer año
	
    Si año MOD 4 = 0 Entonces
        Si año MOD 100 = 0 Entonces
            Si año MOD 400 = 0 Entonces
                Escribir "El año es bisiesto"
            Sino
                Escribir "El año no es bisiesto"
            FinSi
        Sino
            Escribir "El año es bisiesto"
        FinSi
    Sino
        Escribir "El año no es bisiesto"
    FinSi
FinAlgoritmo
