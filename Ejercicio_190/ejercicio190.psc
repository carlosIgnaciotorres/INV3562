Proceso Contar_Numeros_Primos
    Definir N, num, contador_primos, i, j, es_primo Como Entero
    contador_primos <- 0
	
    Escribir "Ingrese la cantidad de números: "
    Leer N
	
    Para i <- 1 Hasta N Hacer
        Escribir "Ingrese un número: "
        Leer num
		
        Si num > 1 Entonces
            es_primo <- 1
            Para j <- 2 Hasta num - 1 Hacer
                Si num MOD j = 0 Entonces
                    es_primo <- 0
                FinSi
            FinPara
            Si es_primo = 1 Entonces
                contador_primos <- contador_primos + 1
            FinSi
        FinSi
    FinPara
	
    Escribir "Cantidad de números primos en la lista: ", contador_primos
FinProceso
