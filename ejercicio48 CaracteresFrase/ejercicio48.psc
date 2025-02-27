Algoritmo CaracteresFrase
    Definir frase Como Cadena
    Definir num_caracteres Como Entero
    Definir primer_caracter, ultimo_caracter Como Caracter
    
    Escribir "Ingrese una frase: "
    Leer frase
    
    num_caracteres <- Longitud(frase)
    
    primer_caracter <- SubCadena(frase, 1, 1)
    
    ultimo_caracter <- SubCadena(frase, num_caracteres, 1)
    
    Escribir "La frase tiene ", num_caracteres, " caracteres."
    Escribir "El primer caracter es: ", primer_caracter
    Escribir "El ultimo caracter es: ", ultimo_caracter
FinAlgoritmo
