# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
A=set(input().split())
N=int(input())

for i in range(N):
    com, comN = input().split()
    R = set(input().split())
    if com == "update":
        A.update(R)
    elif com=="intersection_update":
        A.intersection_update(R)
    elif com=="symmetric_difference_update":
        A.symmetric_difference_update(R)
    else:
        A.difference_update(R)

sum = 0
for i in A:
    temp=int(i)
    sum+=temp

print(sum)
