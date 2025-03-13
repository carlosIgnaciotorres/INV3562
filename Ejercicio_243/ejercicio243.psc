Proceso ContarCaracteresTiempoReal
    Definir palabra1, palabra2 Como Cadena
    Definir contador, i, j Como Entero
    Definir caracter Como Caracter
    Definir encontrado Como Logico
    
    Escribir "Ingrese la primera palabra:"
    Leer palabra1
    Escribir "Ingrese la segunda palabra:"
    Leer palabra2
    
    contador = 0
    
    Para i <- 1 Hasta Longitud(palabra1) Hacer
        caracter <- Subcadena(palabra1, i, i)
        encontrado <- Falso
        
        Para j <- 1 Hasta Longitud(palabra2) Hacer
            Si Subcadena(palabra2, j, j) = caracter Entonces
                encontrado <- Verdadero
            FinSi
        FinPara
        
        Si encontrado Entonces
            contador <- contador + 1
            Escribir "Caracter encontrado: ", caracter, " | Total: ", contador
        FinSi
    FinPara
    
    Escribir "Número total de caracteres de la primera palabra que aparecen en la segunda: ", contador
FinProceso
