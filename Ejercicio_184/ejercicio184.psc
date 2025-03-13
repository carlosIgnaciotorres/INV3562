Proceso Contar_Pares
    Definir N, num, contador_pares Como Entero
    contador_pares <- 0
	
    Escribir "Ingrese la cantidad de números: "
    Leer N
	
    Para i <- 1 Hasta N Hacer
        Escribir "Ingrese un número: "
        Leer num
        Si num MOD 2 = 0 Entonces
            contador_pares <- contador_pares + 1
        FinSi
    FinPara
	
    Escribir "Cantidad de números pares: ", contador_pares
FinProceso
