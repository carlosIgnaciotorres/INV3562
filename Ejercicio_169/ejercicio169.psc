Proceso ContarPalabras
    Definir frase Como Cadena
    Definir i, contador Como Entero
    
    Escribir "Ingrese una frase:"
    Leer frase
    
    contador <- 0
    Para i <- 1 Hasta Longitud(frase) Hacer
        Si SubCadena(frase, i, i) = " " Entonces
            contador <- contador + 1
        FinSi
    FinPara
    
    Si Longitud(frase) > 0 Entonces
        contador <- contador + 1
    FinSi
	
    Escribir "Cantidad de palabras en la frase: ", contador
FinProceso
