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
    
    for(int i=0;i<n;i++){
        for(int j=0;j<3;j++){
            char temp = 'A'+j;
            cout<<temp;
        }
        cout<<endl;
    }
    return 0;
}