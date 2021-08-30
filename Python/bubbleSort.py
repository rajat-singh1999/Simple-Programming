a = [7,8,4,3,1,2,10,54,78,96]
print(a)
for i in range(10-1):
	for j in range(10-i-1):
		if a[j] > a[j+1]:
			temp = a[j]
			a[j] = a[j+1]
			a[j+1] = temp
print(a)

