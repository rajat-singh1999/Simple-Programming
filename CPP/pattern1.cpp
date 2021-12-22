/*
1
23
345
4567
*/
#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;

    for(int i=n-1;i>=0;i--){
        char ch='A'+i;
        for(int j=i;j<n;j++){
            cout<<ch++;
        }
        cout<<endl;
    }
    return 0;
}