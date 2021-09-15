K = int(input())
R = list(input().split())

for i in R:
    c=0
    for j in R:
        if i==j:
            c+=1
        if c==2:
            c=-1
            break
    if c==-1:
        continue
    if c==1:
        break
print(i)
