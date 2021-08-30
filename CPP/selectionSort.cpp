#include<bits/stdc++.h>
using namespace std;

void selectionSort(int a[], int n)
{
	for(int i=0; i<n; i++)
	{
		int min=i;
		for(int j = i; j<n; j++)
		{
			if(a[j]<a[min])
				min = j;
		}
		int temp = a[min];
		a[min] = a[i];
		a[i] = temp;
		for(int i=0;i<10;i++)
			cout << a[i] << " ";
		cout << "\n";
	}
	
	for(int i=0;i<10;i++)
		cout << a[i] << " ";
}

int main()
{
	int arr[] = {7,8,64,7,65,4,2,1,69,7};
	int n = sizeof(arr)/sizeof(arr[0]);

	selectionSort(arr, n);
	return 0;
}
