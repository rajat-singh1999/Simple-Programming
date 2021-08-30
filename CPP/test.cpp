#include <iostream>
using namespace std;

void sortShow(int arr[], int start, int end)
{
    while (start < end)
    {
        for (int i = 0; i < end; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        end--;
    }


    for (int i = 0; i < 6; i++)
    {
        cout << arr[i] << " ";
    }

    cout<<endl;
    cout<<arr[0]<<endl;
    int min = arr[0];
    cout<<min;
}

int main()
{
    int arr[6] = {7, 10, 4, 3, 20, 15};

    int start = 0, end = (sizeof(arr)/sizeof(arr[0]))-1;

    sortShow(arr, start, end);
    
    return 0;
}