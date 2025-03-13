
PI = 3.14

def calcular_longitud_circunferencia():
  
    radio = float(input("Introduce el valor del radio de la circunferencia: "))
    
    
    longitud = 2 * PI * radio
    
    
    print(f"La longitud de la circunferencia con radio {radio} es: {longitud:.2f}")

calcular_longitud_circunferencia()
