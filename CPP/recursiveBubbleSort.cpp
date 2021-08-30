#include<bits/stdc++.h>
using namespace std;

void bubbleSort(int a[], int n)
{
	if(n==1)
		return;
	int j;
	for(j=0; j<n-1; j++)
		{
			if(a[j]>a[j+1])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
		
		for(j=0; j<10 ;j++)
			cout << a[j] << " ";
		cout << "\n";
	bubbleSort(a, n-1);
}

int main()
{
	cout << "\n";
	int a[] = {5,6,7,8,4,1,10,25,11,13};
	bubbleSort(a, 10);
	for(int j=0;j<10;j++)
		cout << a[j] << " m ";
	cout << "\n";		
	return 0;
}
