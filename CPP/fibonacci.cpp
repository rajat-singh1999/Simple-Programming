#include<bits/stdc++.h>
 
class Fibo{
     
public:
int fibonacci(int n)
{
    int f[n + 2];
    int i;
 
    f[0] = 0;
    f[1] = 1;
 
    for(i = 2; i <= n; i++)
    {
       f[i] = f[i - 1] + f[i - 2];
    }
    return f[n];
    }
};
 
int main ()
{
    Fibo obj;
    int n = 9;
     
    std::cout << obj.fibonacci(n);
    return 0;
}

