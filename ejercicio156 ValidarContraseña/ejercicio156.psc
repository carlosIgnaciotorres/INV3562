Algoritmo ValidarContrase�a
    Definir contrase�a Como Cadena
    Definir longitud Como Entero
    Definir es_valida Como Logico
    
    Escribir "Ingresa una contrase�a:"
    Leer contrase�a
    
    longitud = LongitudCadena(contrase�a)
    
    es_valida = (longitud >= 8)
    
    Si es_valida Entonces
        Escribir "Contrase�a v�lida"
    Sino
        Escribir "Contrase�a inv�lida"
    FinSi
FinAlgoritmo