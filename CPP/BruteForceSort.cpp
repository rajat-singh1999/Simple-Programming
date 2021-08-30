#include <iostream>
using namespace std;

void customSort(int a[], int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]<a[j])
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}

int main() {
	cout<<"GfG!"<<endl;
	int arr[] = {0, 23, 9, 14, 21, 1};
	int n = sizeof(arr)/sizeof(arr[0]);
	
	customSort(arr, n);
	
	for(int i=0;i<n;i++)
	{
	    cout<<arr[i]<<" ";
	}
	return 0;
}