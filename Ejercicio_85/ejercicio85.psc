Algoritmo TrianguloClasificacionYArea
    Escribir "Ingresa el valor de A (lado menor):"
    Leer A
    Escribir "Ingresa el valor de B (lado medio):"
    Leer B
    Escribir "Ingresa el valor de C (lado mayor):"
    Leer C
	
    Si A + B > C Entonces
        Si A = B Y B = C Entonces
            Tipo <- "Equilátero"
        SiNo
            Si A = B O B = C O A = C Entonces
                Tipo <- "Isósceles"
            SiNo
                Tipo <- "Escaleno"
            FinSi
        FinSi
		
        s <- (A + B + C) / 2
        Area <- Raiz(s * (s - A) * (s - B) * (s - C))
		
        Escribir "El triángulo es: ", Tipo
        Escribir "El área del triángulo es: ", Area
    SiNo
        Escribir "No es un triángulo válido."
    FinSi
FinAlgoritmo

