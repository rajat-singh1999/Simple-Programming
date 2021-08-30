def bubbleSort(a, n):
	if n==1:
		return
	for i in range(n-1):
		if a[i] > a[i+1]:
			temp = a[i+1]
			a[i+1] = a[i]
			a[i] = temp
	print(a)
	return bubbleSort(a, n-1)

a = [12, 45, 62, 7, 1, 54, 16, 85, 97, 21]
print(a)
bubbleSort(a, len(a))
print(a)





