Proceso AreaPerimetroPentagono
    Definir L, Perimetro, Area, apotema Como Real
    Escribir "Ingrese la longitud del lado del pentágono: "
    Leer L
    Perimetro <- 5 * L
    apotema <- L / (2 * tan(36))
    Area <- (Perimetro * apotema) / 2
    Escribir "El perímetro es: ", Perimetro
    Escribir "El área es: ", Area
FinProceso
