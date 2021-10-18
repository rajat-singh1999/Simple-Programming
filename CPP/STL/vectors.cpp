#include<iostream>
#include<vector>
int main()
{
    std::vector<int> v;//initialization of vector of size zero
    std::vector<int> a(5,1);//initialization of vector size 5, all 5 elements are 1
    std::vector<int> b(7);//initialization of vector size 5, all 5 elements are 
    
    std::vector<int> last(a);//vector 'last' is initiualized as a copy of vector 'a'

    std::cout<<"Size-> "<<v.capacity()<<std::endl;  //Capacity of a vector is the memory allocated to it,
    v.push_back(1);                                 // whereas, size of the vector is the amount of memory it is using.
    std::cout<<"Size-> "<<v.capacity()<<std::endl;
    v.push_back(5);
    std::cout<<"Size-> "<<v.capacity()<<std::endl;
    v.push_back(14);
    std::cout<<"Size-> "<<v.capacity()<<std::endl;

    std::cout<<"Front: "<<v.front()<<" Back: "<<v.back()<<" Element at index 2: "<<v.at(1)<<std::endl;

    std::cout<<"Before pop_back: ";

    for(int i:v)
    {
        std::cout<<i<<" ";
    }

    v.pop_back();

    std::cout<<std::endl<<"After pop_back: ";

    for(int i:v)
    {
        std::cout<<i<<" ";
    }

    std::cout<<std::endl<<"Size before clearing: "<<v.size()<<std::endl;
    v.clear();
    std::cout<<"Size after clearing: "<<v.size()<<std::endl;
    
    //When we clear the vector using clear function, size becomes zero but the capacity remains unchanged.

    return 0;
}