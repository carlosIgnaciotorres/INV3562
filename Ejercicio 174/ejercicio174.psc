Proceso PrimoGemelo
    Definir n Como Entero
    Escribir "Ingrese un número:"
    Leer n
    
    Si EsPrimo(n) Entonces
        Si EsPrimo(n+2) Entonces
            Escribir n, " y ", n+2, " son primos gemelos."
        Sino
            Escribir n, " no es parte de un par de primos gemelos."
        FinSi
    Sino
        Escribir n, " no es parte de un par de primos gemelos."
    FinSi
FinProceso

Funcion resultado <- EsPrimo(numero)
    Definir i Como Entero
    Si numero <= 1 Entonces
        resultado = Falso
        
    FinSi
    Para i = 2 Hasta numero-1 Hacer
        Si numero MOD i = 0 Entonces
            resultado = Falso
            
        FinSi
    FinPara
    resultado = Verdadero
    
FinFuncion
