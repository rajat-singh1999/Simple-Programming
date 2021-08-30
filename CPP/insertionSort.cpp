#include<bits/stdc++.h>
using namespace std;

void insertionSort(int a[])
{
    int i, key, j;  
    for (i = 1; i < 10; i++) 
    {  
        key = a[i];  
        cout << "key: " << key;
        j = i - 1;  
  
        while (j >= 0 && a[j] > key) 
        {  
            a[j + 1] = a[j];  
            j = j - 1;  
        }
        a[j + 1] = key;  
    	cout << "\n";
    	for(j=0;j<10;j++)
		cout << a[j] << " ";
	cout << "\n";
    }
		
  
}

int main()
{
	cout << "\n";
	int a[] = {5,6,7,8,4,1,10,25,11,13};
	insertionSort(a);
	for(int j=0;j<10;j++)
		cout << a[j] << " m ";
	cout << "\n";		
	return 0;
}

