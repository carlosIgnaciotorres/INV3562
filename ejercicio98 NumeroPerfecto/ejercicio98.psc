Algoritmo NumeroPerfecto
    Definir n, i, suma Como Entero
    suma <- 0
    Escribir "Ingrese un n�mero entero positivo:"
    Leer n
    Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
        Si n MOD i = 0 Entonces
            suma <- suma + i
        FinSi
    FinPara
    Si suma = n Entonces
        Escribir "El n�mero ", n, " es perfecto."
    SiNo
        Escribir "El n�mero ", n, " no es perfecto."
    FinSi
FinAlgoritmo
