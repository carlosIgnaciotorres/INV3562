Algoritmo PalabraReversa
    
    Definir palabra Como Cadena
    Definir palabra_reversa Como Cadena
    Definir longitud, i Como Entero
    
    Escribir "Ingresa una palabra:"
    Leer palabra
    
    longitud = LongitudCadena(palabra)
    
    palabra_reversa = ""
    
    Para i = longitud Hasta 1 Con Paso -1 Hacer
        palabra_reversa = palabra_reversa + Subcadena(palabra, i, i)
    FinPara
    
    Escribir "La palabra en reversa es:", palabra_reversa
FinAlgoritmo