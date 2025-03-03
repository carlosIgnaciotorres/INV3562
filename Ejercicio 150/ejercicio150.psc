Algoritmo CuadradoPerfecto
    Definir numero Como Entero
    Definir raiz_cuadrada Como Real
    Definir raiz_redondeada Como Entero
    
    Escribir "Ingresa un número:"
    Leer numero
    
    raiz_cuadrada = rc(numero)  
    raiz_redondeada = redon(raiz_cuadrada)  
    
    Si raiz_redondeada * raiz_redondeada == numero Entonces
        Escribir "Es un cuadrado perfecto"
    Sino
        Escribir "No es un cuadrado perfecto"
    FinSi
FinAlgoritmo