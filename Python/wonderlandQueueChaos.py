def minimumBribes(q):
    bribes = 0 
    q = [P-1 for P in q]

    for i,P in enumerate(q):
        if P - i > 2:
            print("Too chaotic")
            return

        for j in range(max(P-1,0),i):
            if q[j] > P:
                bribes += 1

    print(bribes)


if __name__=="__main__":
    minimumBribes([1, 2, 5, 3, 7, 8, 6, 4])