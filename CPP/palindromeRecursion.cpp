#include <bits/stdc++.h>
using namespace std;

bool recursionDriver(char str[], int s, int e)
{
    if (s == e)
        return true;

    if (str[s] != str[e])
        return false;
  
    if (s < e + 1)
        return recursionDriver(str, s + 1, e - 1);
  
    return true;
}
  
bool isPalindrome(char str[])
{
    int n = strlen(str);
      
    if (n == 0)
        return true;
      
    return recursionDriver(str, 0, n - 1);
}
  
int main()
{
    char str[] = "abcacacba";
  
    if (isPalindrome(str))
    std::cout << "Yes";
    else
    std::cout << "No";
  
    return 0;
}
 