import math 
  
def solveQuadratic( a, b, c): 
  
    disciminant = b * b - 4 * a * c 
    sqRoot = math.sqrt(abs(disciminant)) 
      
    if disciminant > 0: 
        print(f"The equation has real and different roots: {(-b + sqRoot)/(2 * a)} and {(-b - sqRoot)/(2 * a)}") 
      
    elif disciminant == 0: 
        print(f"The equation has real and same roots: {-b / (2 * a)} and {-b / (2 * a)}") 

    else:
        print(f"The equation has Complex Roots: {- b / (2 * a)} + i{sqRoot} and {- b / (2 * a)} - i{sqRoot}") 

a = float(input("Enter value of a: "))
b = float(input("Enter value of b: "))
c = float(input("Enter value of c: "))
  
if a == 0: 
        print("Invalid quadratic equation") 
  
else:
    solveQuadratic(a, b, c)
