Algoritmo ContarVocales
    Definir palabra Como Cadena
    Definir contador Como Entero
    Definir letra Como Cadena
    Definir i Como Entero
    
    Escribir "Ingresa una palabra:"
    Leer palabra
    
    contador = 0
    
    Para i = 0 Hasta Longitud(palabra) - 1 Con Paso 1 Hacer
        letra = Subcadena(palabra, i, i)
        Si letra == "a" O letra == "e" O letra == "i" O letra == "o" O letra == "u" Entonces
            contador = contador + 1
        FinSi
    FinPara
    
    Escribir "El número de vocales es:", contador
FinAlgoritmo