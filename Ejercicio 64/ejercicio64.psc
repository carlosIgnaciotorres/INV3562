Algoritmo VerificarDivisibilidad
    Definir numero1, numero2, residuo Como Entero;
    Escribir "Ingrese el primer n�mero (dividendo):";
    Leer numero1;
    Escribir "Ingrese el segundo n�mero (divisor):";
    Leer numero2;
    Si numero2 = 0 Entonces
        Escribir "Error: No se puede dividir entre 0.";
    SiNo
        residuo <- numero1 mod numero2;
        Si residuo = 0 Entonces
            Escribir "El n�mero ", numero1, " es divisible por ", numero2;
        SiNo
            Escribir "El n�mero ", numero1, " no es divisible por ", numero2;
        FinSi
    FinSi
FinAlgoritmo
