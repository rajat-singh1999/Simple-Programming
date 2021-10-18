import array as arr

def rotLeft(a, d):
    n = len(a)
    for i in range(d):
        a = a[1:len(a)]+a[:1]
    return a




if __name__=="__main__":
    a = arr.array('i', [1, 2, 3, 4, 5])

    print(rotLeft(a, 2))

