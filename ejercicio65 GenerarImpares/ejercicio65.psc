Algoritmo GenerarImpares
    Definir N, contador Como Entero;
	
    Escribir "Ingrese un n�mero N:";
    Leer N;
	
    contador <- 1;
	
    Mientras contador <= N Hacer
        Si contador mod 2 <> 0 Entonces
            Escribir contador;
        FinSi
        contador <- contador + 1;
    FinMientras
	
FinAlgoritmo
