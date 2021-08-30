lst = [2, 4, 6, 5, 2, 1, 3, 8, 7, 9, 5]
import sys 
A = [2, 4, 6, 5, 2, 1, 3, 8, 7, 9, 5] 
print(A)
  
for i in range(len(A)): 
      
    min_idx = i 
    for j in range(i+1, len(A)): 
        if A[min_idx] > A[j]: 
            min_idx = j 
              
    A[i], A[min_idx] = A[min_idx], A[i] 

print ("Sorted array") 
print(A)



