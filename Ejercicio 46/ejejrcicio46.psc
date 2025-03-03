Algoritmo CalcularSalario
    Definir horas_trabajadas, valor_por_hora, salario_total, descuento_ss, descuento_fondo, salario_neto Como Real
    Escribir "Ingrese la cantidad de horas trabajadas: "
    Leer horas_trabajadas
    Escribir "Ingrese el valor de la hora: "
    Leer valor_por_hora
    salario_total <- horas_trabajadas * valor_por_hora
    descuento_ss <- salario_total * 0.10
    descuento_fondo <- salario_total * 0.01
    salario_neto <- salario_total - descuento_ss - descuento_fondo
    Escribir "El salario neto a pagar es: ", salario_neto
FinAlgoritmo
