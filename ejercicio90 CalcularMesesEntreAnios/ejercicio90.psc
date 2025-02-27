Algoritmo CalcularMesesEntreAnios
    Leer Año1
    Leer Año2
    Si Año1 > Año2 Entonces
        Meses <- (Año1 - Año2) * 12
    SiNo
        Meses <- (Año2 - Año1) * 12
    FinSi
    Escribir "Los meses transcurridos entre los inicios de los dos años son: ", Meses
FinAlgoritmo
