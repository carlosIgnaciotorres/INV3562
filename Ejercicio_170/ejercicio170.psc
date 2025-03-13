Proceso EsPalindromo
    Definir texto, textoLimpio, textoReverso Como Cadena
    Definir i Como Entero
    
    Escribir "Ingrese un texto:"
    Leer texto
    
    textoLimpio <- ""
    
    Para i <- 1 Hasta Longitud(texto) Hacer
        Si (SubCadena(texto, i, i) >= "a" Y SubCadena(texto, i, i) <= "z") O
			(SubCadena(texto, i, i) >= "A" Y SubCadena(texto, i, i) <= "Z") Entonces
            textoLimpio <- textoLimpio + Minusculas(SubCadena(texto, i, i))
        FinSi
    FinPara
    
    textoReverso <- ""
    
    Para i <- Longitud(textoLimpio) Hasta 1 Con Paso -1 Hacer
        textoReverso <- textoReverso + SubCadena(textoLimpio, i, i)
    FinPara
	
    Si textoLimpio = textoReverso Entonces
        Escribir "Es un palíndromo."
    Sino
        Escribir "No es un palíndromo."
    FinSi
FinProceso
