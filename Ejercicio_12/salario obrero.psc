Proceso CalcularNuevoSalario
    
    Definir salarioOriginal, incremento, nuevoSalario Como Real
    Definir porcentajeIncremento Como Real
    porcentajeIncremento <- 25
    
    
    Escribir "Ingrese el salario original del obrero: "
    Leer salarioOriginal
    
    
    incremento <- salarioOriginal * (porcentajeIncremento / 100)
    
    
    nuevoSalario <- salarioOriginal + incremento
    
    
    Escribir "El nuevo salario después del incremento del ", porcentajeIncremento, "% es: ", nuevoSalario
FinProceso
