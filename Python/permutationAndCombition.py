import math
def fact(n):
	if (n <= 1):
		return 1
		
	return n * fact(n - 1)

n = int(input("Enter value of N: "))
r = int(input("Enter value of R: "))

print(f"{n} P {r} = {math.floor(fact(n) / fact(n - r))}")
print(f"{n} C {r} = {math.floor(fact(n) / ( fact(r) * fact(n-r) ) ) }")
