n = int(input("Enter a number: "))

even=0
odd=0

for i in range(n):
    a = i+1
    if a%2 == 0:
        even += a
    else:
        odd += a

print(f"Sum of even numbers from 1 to {n}: {even}")
print(f"Sum of odd numbers from 1 to {n}: {odd}")
