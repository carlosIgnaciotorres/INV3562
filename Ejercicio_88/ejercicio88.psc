Algoritmo CalcularInteresesReinversion
    Leer MontoInvertido
    Leer TasaInteres
    Intereses <- MontoInvertido * (TasaInteres / 100)
    Si Intereses > 7000 Entonces
        MontoFinal <- MontoInvertido + Intereses
    SiNo
        MontoFinal <- MontoInvertido
    FinSi
    Escribir "Los intereses generados son: ", Intereses
    Escribir "El monto final en la cuenta es: ", MontoFinal
FinAlgoritmo
