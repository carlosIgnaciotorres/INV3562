Algoritmo SumaNumeros
    Definir N, numero, suma, contador Como Entero;
    Definir excedido Como Logico;
	
    Escribir "Ingrese la cantidad de n�meros a sumar (N):";
    Leer N;
	
    suma <- 0;
    contador <- 1;
    excedido <- Falso;
	
    Mientras contador <= N Y excedido = Falso Hacer
        Escribir "Ingrese un n�mero:";
        Leer numero;
		
        suma <- suma + numero;
		
        Si suma > 1000 Entonces
            Escribir "El n�mero que excedi� el l�mite fue:", numero;
            excedido <- Verdadero;
        FinSi
		
        contador <- contador + 1;
    FinMientras;
	
    Si excedido = Falso Entonces
        Escribir "La suma total es:", suma;
    FinSi
FinAlgoritmo
