Proceso Contar_Divisores
    Definir num, contador_divisores, i Como Entero
    contador_divisores <- 0
	
    Escribir "Ingrese un número: "
    Leer num
	
    Para i <- 1 Hasta num Hacer
        Si num MOD i = 0 Entonces
            contador_divisores <- contador_divisores + 1
        FinSi
    FinPara
	
    Escribir "Cantidad de divisores: ", contador_divisores
FinProceso
