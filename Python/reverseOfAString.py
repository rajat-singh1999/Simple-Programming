def factorial(n):
   if n == 1:
       return n
   else:
       return n*factorial(n-1)

def fibo(n):
   if n <= 1:
       return n
   else:
       return(fibo(n-1) + fibo(n-2))

num = int(input("Enter: "))
print(f"Factorial of {num} is {factorial(num)}.")
print("Fibonacci sequence:")
for i in range(num):
    print(fibo(i))