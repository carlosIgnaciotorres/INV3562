Algoritmo ContarNumerosPrimos
    Definir N, i, j, contador, esPrimo Como Entero
    Definir numeros Como Entero
    Escribir "Ingrese la cantidad de números:"
    Leer N
    Dimension numeros[N]
    Para i <- 0 Hasta N-1 Con Paso 1 Hacer
        Escribir "Ingrese el número ", i+1, ":"
        Leer numeros[i]
    FinPara
    contador <- 0
    Para i <- 0 Hasta N-1 Con Paso 1 Hacer
        esPrimo <- 1
        Si numeros[i] < 2 Entonces
            esPrimo <- 0
        Sino
            Para j <- 2 Hasta raiz(numeros[i]) Con Paso 1 Hacer
                Si numeros[i] % j == 0 Entonces
                    esPrimo <- 0
                    
                FinSi
            FinPara
        FinSi
        Si esPrimo == 1 Entonces
            contador <- contador + 1
        FinSi
    FinPara
    Escribir "La cantidad de números primos es: ", contador
FinAlgoritmo