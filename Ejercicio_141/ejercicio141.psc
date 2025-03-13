Algoritmo PorcentajeHombresMujeres
    Definir hombres, mujeres, total_estudiantes Como Entero
    Definir porcentaje_hombres, porcentaje_mujeres Como Real
    Escribir "Ingrese la cantidad de hombres: "
    Leer hombres
    Escribir "Ingrese la cantidad de mujeres: "
    Leer mujeres
    total_estudiantes <- hombres + mujeres
    Si total_estudiantes > 0 Entonces
        porcentaje_hombres <- (hombres / total_estudiantes) * 100
        porcentaje_mujeres <- (mujeres / total_estudiantes) * 100
        Escribir "Porcentaje de hombres: ", porcentaje_hombres, "%"
        Escribir "Porcentaje de mujeres: ", porcentaje_mujeres, "%"
    Sino
        Escribir "Error: No hay estudiantes en el grupo"
    FinSi
FinAlgoritmo
