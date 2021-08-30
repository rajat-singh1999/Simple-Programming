#include<iostream>
#include<deque>

int main()
{
    std::deque<int> d;
    d.push_back(1);
    d.push_front(14);
    
    for(int i:d)
    {
        std::cout<<i<<" ";
    }

    d.pop_back();

    std::cout<<std::endl;
    for(int i:d)
    {
        std::cout<<i<<" ";
    }

    d.push_back(17);
    d.push_front(34);
    d.push_back(21);
    d.push_front(12);
    std::cout<<std::endl;
    for(int i:d)
    {
        std::cout<<i<<" ";
    }

    d.pop_front();
    std::cout<<std::endl;

    for(int i:d)
    {
        std::cout<<i<<" ";
    }


    d.pop_back();
    std::cout<<std::endl;

    for(int i:d)
    {
        std::cout<<i<<" ";
    }

    return 0;
}