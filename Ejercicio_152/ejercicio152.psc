Algoritmo ParImparMultiploDe5
    Definir numero Como Entero
    Definir es_par Como Logico
    Definir es_multiplo_de_5 Como Logico
    
    Escribir "Ingresa un número:"
    Leer numero
    
    es_par = (numero % 2 == 0)
    es_multiplo_de_5 = (numero % 5 == 0)
    
    Si es_par Entonces
        Escribir "El número es par"
    Sino
        Escribir "El número es impar"
    FinSi
    
    Si es_multiplo_de_5 Entonces
        Escribir "El número es múltiplo de 5"
    Sino
        Escribir "El número no es múltiplo de 5"
    FinSi
FinAlgoritmo