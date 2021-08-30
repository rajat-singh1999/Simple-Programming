#include<iostream>
using namespace std;

int work(int A[], int B, int n)
{
    int arr[2*B];
    int i,j;
    for(i=0;i<B;i++)
    {
        arr[i] = A[i];
    }

    int diff=0;
    if(2*B > n)
    {
        diff = 2*B - n;
        cout<<"\n"<<diff<<endl;
    }

    for(i=n-1, j=B;i<B-diff;i--,j++)
    {
        arr[j] = A[i];
    }
    
    for(i=0; i<(sizeof(arr)/sizeof(arr[0]))-1; i++)
    {
        cout << " " << arr[i];
    }

    return n;
}

int main()
{
    int A[] = {5, -2, 3, 1, 2};
    int B = 3;
    int n = sizeof(A)/sizeof(A[0]);

    //cout << "\nHi " <<work(A, B, n) << endl;
    int c = work(A,B,n);
    return 0;
}
