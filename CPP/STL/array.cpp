#include<iostream>
#include<array>

using namespace std;

int main()
{
    int basic[4] = {1,2,3,4};

    array<int,4> a = {1,2,3,4};
    int size = a.size();

    for(int i=0;i<size;i++)
        cout<<a[i]<<endl;
    
    cout<<"Element at 2nd index is-> "<<a.at(2-1)<<endl;

    cout<<"Empty or not-> "<<a.empty()<<endl;

    cout<<"First element-> "<<a.front()<<endl;

    cout<<"Last Element-> "<<a.back()<<endl;
}
