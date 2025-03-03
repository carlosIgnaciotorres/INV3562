N1 = float(input("Ingresa la nota N1: "))
N2 = float(input("Ingresa la nota N2: "))
N3 = float(input("Ingresa la nota N3: "))
N4 = float(input("Ingresa la nota N4: "))
EMC = float(input("Ingresa la nota del Examen de Medio Curso (EMC): "))
NotaFIN = float(input("Ingresa la nota del Examen Final: "))
menorNota = N1
if N2 < menorNota:
    menorNota = N2
if N3 < menorNota:
    menorNota = N3
if N4 < menorNota:
    menorNota = N4
if EMC < menorNota:
    menorNota = EMC
if NotaFIN < menorNota:
    menorNota = NotaFIN
print(f"La menor nota es: {menorNota}")
