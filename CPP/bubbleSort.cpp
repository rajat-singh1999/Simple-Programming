#include<bits/stdc++.h>
using namespace std;

void bubbleSort(int a[])
{
	int i, j;
	bool change;
	for(i=0; i<10-1; i++)
	{
		change = false;
		for(j=0; j<10-i-1; j++)
		{
			if(a[j]>a[j+1])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				change = true;
			}
		}
		
		for(j=0;j<10;j++)
			cout << a[j] << " ";
		cout << "\n";
		if(change==false)
			break;
	}
}

int main()
{
	cout << "\n";
	int a[] = {5,6,7,8,4,1,10,25,11,13};
	bubbleSort(a);
	for(int j=0;j<10;j++)
		cout << a[j] << " m ";
	cout << "\n";		
	return 0;
}
