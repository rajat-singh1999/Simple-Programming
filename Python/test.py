# x = {"c", "b", "a"}
# y = {"a", "b", "d"}

# z = x.issuperset(y) 

# print(z)


def printCustom(a):
    for i in range(0, len(a)):
        a[i] = a[i]+2
    return a

if __name__=="__main__":
    a = [1, 45, 47, 2, 3, 62]
    temp = printCustom(a)
    print(temp)