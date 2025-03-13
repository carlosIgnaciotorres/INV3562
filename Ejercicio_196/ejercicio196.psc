Funcion esFeliz <- DeterminarFelicidad(N)
    Definir visto Como Conjunto
    Mientras N <> 1 y N No Pertenece a visto Hacer
        Agregar N a visto
        suma <- 0
        Mientras N > 0 Hacer
            digito <- N MOD 10
            suma <- suma + (digito * digito)
            N <- N DIV 10
        FinMientras
        N <- suma
    FinMientras
    Si N = 1 Entonces
        esFeliz <- Verdadero
    Sino
        esFeliz <- Falso
    FinSi
FinFuncion

Proceso Principal
    Definir N Como Entero
    Escribir "Ingrese un número:"
    Leer N
    Si DeterminarFelicidad(N) Entonces
        Escribir "El número es feliz."
    Sino
        Escribir "El número no es feliz."
    FinSi
FinProceso
