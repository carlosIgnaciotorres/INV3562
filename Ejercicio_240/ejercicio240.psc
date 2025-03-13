Proceso Luhn
    Definir numero Como Cadena
    Definir total, n, i Como Entero
    Definir alternar Como Logico
    total <- 0
    alternar <- Falso
    
    Escribir "Ingrese el número de tarjeta: "
    Leer numero
    
    Para i <- Longitud(numero) Hasta 1 Con Paso -1 Hacer
        n <- ConvertirANumero(Subcadena(numero, i, i))
        
        Si alternar Entonces
            n <- n * 2
            Si n > 9 Entonces
                n <- n - 9
            FinSi
        FinSi
        
        total <- total + n
        alternar <- No alternar
    FinPara
    
    Si total MOD 10 = 0 Entonces
        Escribir "Número válido según el algoritmo de Luhn."
    Sino
        Escribir "Número inválido según el algoritmo de Luhn."
    FinSi
FinProceso
