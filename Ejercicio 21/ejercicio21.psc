Proceso CalcularSalario
	
	
	Definir horasTrabajadas, valorHora, salarioBruto, descuentoSS, descuentoFondo, salarioNeto Como Real
	
	
	Escribir "Ingrese la cantidad de horas trabajadas en el mes: "
	Leer horasTrabajadas
	Escribir "Ingrese el valor de la hora de trabajo: "
	Leer valorHora
	
	
	salarioBruto = horasTrabajadas * valorHora
	
	
	descuentoSS = salarioBruto * 0.10 
	descuentoFondo = salarioBruto * 0.01 
	
	
	salarioNeto = salarioBruto - descuentoSS - descuentoFondo
	
	
	Escribir "Salario bruto: ", salarioBruto
	Escribir "Descuento por seguridad social (10%): ", descuentoSS
	Escribir "Descuento por fondo de empleados (1%): ", descuentoFondo
	Escribir "Salario neto a pagar: ", salarioNeto
FinProceso