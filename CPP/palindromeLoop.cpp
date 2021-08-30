#include <bits/stdc++.h>
#include<string>

int main(){
    char s1[20];
    int i, len;
    int f = 0;
    
    std::cout << "Enter a string: ";
    std::cin >> s1;
    
    len = strlen(s1);
    
    for(i=0;i < len ;i++){
        if(s1[i] != s1[len-i-1]){
            f = 1;
            break;
   }
}
    
    if (f) {
        std::cout << s1 << " is not a palindrome" << std::endl; 
    }    
    else {
        std::cout << s1 << " is a palindrome" << std::endl; 
    }
    system("pause");
    return 0;
}