Algoritmo TrianguloClasificacionYArea
    Escribir "Ingresa el valor de A (lado menor):"
    Leer A
    Escribir "Ingresa el valor de B (lado medio):"
    Leer B
    Escribir "Ingresa el valor de C (lado mayor):"
    Leer C
	
    Si A + B > C Entonces
        Si A = B Y B = C Entonces
            Tipo <- "Equil�tero"
        SiNo
            Si A = B O B = C O A = C Entonces
                Tipo <- "Is�sceles"
            SiNo
                Tipo <- "Escaleno"
            FinSi
        FinSi
		
        s <- (A + B + C) / 2
        Area <- Raiz(s * (s - A) * (s - B) * (s - C))
		
        Escribir "El tri�ngulo es: ", Tipo
        Escribir "El �rea del tri�ngulo es: ", Area
    SiNo
        Escribir "No es un tri�ngulo v�lido."
    FinSi
FinAlgoritmo

