#include <iostream>

//A simple calculator using templates


template <class T>
T add(T a, T b)
{
 T result;
 result = a + b;
 return result;
}


template <class T>
T subtract(T a, T b)
{
 T result;
 result = a - b;
 return result;
}



template <class T>
T divide(T a, T b)
{
 T result;
 result = a / b;
 return result;
}



template <class T>
T multiply(T a, T b)
{
 T result;
 result = a * b;
 return result;
}


int main(void)
{
 int a,b;
 float c,d;
 std::cin>>a>>b>>c>>d;
 std::cout<<"Addition is: "<<add<int>(a,b)<<std::endl;
 std::cout<<"Subtraction is: "<<subtract<int>(a,b)<<std::endl;
 std::cout<<"Product is: "<<multiply<int>(a,b)<<std::endl;
 std::cout<<"Division is: "<<divide<int>(a,b)<<std::endl;
 std::cout<<"Addition is: "<<add<float>(c,d)<<std::endl;
 std::cout<<"Subtraction is: "<<subtract<float>(c,d)<<std::endl;
 std::cout<<"Product is: "<<multiply<float>(c,d)<<std::endl;
 std::cout<<"Division is: "<<divide<float>(c,d)<<std::endl;
 std::cin.get();
 
 return 0;
}