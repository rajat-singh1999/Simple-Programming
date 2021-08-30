n = int(input("Enter a number: "))
if n<1:
    print("Invalid Input.")
elif n==1 or n==2:
    print(f"{n} is prime.")
else:
    i=1
    flag=0
    while(i<=n):
        if n%i == 0:
            flag += 1
        i += 1
    
    if flag ==2:
        print(f"{n} is prime.")
    else:
        print(f"{n} is not prime.")

