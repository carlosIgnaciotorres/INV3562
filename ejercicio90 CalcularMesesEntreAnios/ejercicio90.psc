Algoritmo CalcularMesesEntreAnios
    Leer A�o1
    Leer A�o2
    Si A�o1 > A�o2 Entonces
        Meses <- (A�o1 - A�o2) * 12
    SiNo
        Meses <- (A�o2 - A�o1) * 12
    FinSi
    Escribir "Los meses transcurridos entre los inicios de los dos a�os son: ", Meses
FinAlgoritmo
