Algoritmo VerificarNumeroPerfecto
    Definir numero, suma, i Como Entero
    Escribir "Ingrese un número:"
    Leer numero
    suma <- 0
    Para i <- 1 Hasta numero / 2 Con Paso 1 Hacer
        Si numero % i == 0 Entonces
            suma <- suma + i
        FinSi
    FinPara
    Si suma == numero Entonces
        Escribir "El número ", numero, " es perfecto."
    Sino
        Escribir "El número ", numero, " no es perfecto."
    FinSi
FinAlgoritmo