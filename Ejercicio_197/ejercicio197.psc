Proceso ContarCaracteresEspeciales
    Definir texto Como Cadena
    Definir i, contador Como Entero
    contador <- 0
    Escribir "Ingrese un texto:"
    Leer texto
	
    Para i <- 1 Hasta Longitud(texto) Hacer
        caracter <- SubCadena(texto, i, i)
        Si (caracter >= "!" Y caracter <= "/" ) O (caracter >= ":" Y caracter <= "@" ) O (caracter >= "[" Y caracter <= "`" ) O (caracter >= "{" Y caracter <= "~" ) Entonces
            contador <- contador + 1
        FinSi
    FinPara
	
    Escribir "Cantidad de caracteres especiales:", contador
FinProceso
