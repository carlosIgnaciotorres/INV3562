Algoritmo EncontrarMenorNota
    Escribir "Ingresa la nota N1: "
    Leer N1
    Escribir "Ingresa la nota N2: "
    Leer N2
    Escribir "Ingresa la nota N3: "
    Leer N3
    Escribir "Ingresa la nota N4: "
    Leer N4
    Escribir "Ingresa la nota del Examen de Medio Curso (EMC): "
    Leer EMC
    Escribir "Ingresa la nota del Examen Final: "
    Leer NotaFIN
    MenorNota <- N1
    Si N2 < MenorNota Entonces
        MenorNota <- N2
    FinSi
    Si N3 < MenorNota Entonces
        MenorNota <- N3
    FinSi
    Si N4 < MenorNota Entonces
        MenorNota <- N4
    FinSi
    Si EMC < MenorNota Entonces
        MenorNota <- EMC
    FinSi
    Si NotaFIN < MenorNota Entonces
        MenorNota <- NotaFIN
    FinSi
    Escribir "La menor nota es: ", MenorNota
FinAlgoritmo
