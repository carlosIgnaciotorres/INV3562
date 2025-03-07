Proceso NumeroCercanoAMedia
    Definir numeros, diferencia Como Real
    Definir i, masCercano Como Entero
    Dimension numeros[5]
    
    Escribir "Ingrese 5 números:"
    Para i = 0 Hasta 4 Hacer
        Leer numeros[i]
    FinPara
    
    Definir suma, media Como Real
    suma <- 0
    Para i = 0 Hasta 4 Hacer
        suma <- suma + numeros[i]
    FinPara
    media <- suma / 5
    
    masCercano <- numeros[0]
    diferencia <- Abs(numeros[0] - media)
    
    Para i = 1 Hasta 4 Hacer
        Si Abs(numeros[i] - media) < diferencia Entonces
            masCercano <- numeros[i]
            diferencia <- Abs(numeros[i] - media)
        FinSi
    FinPara
    
    Escribir "La media es: ", media
    Escribir "El número más cercano a la media es: ", masCercano
FinProceso
