#include<iostream>
using namespace std;
class Complex{
public:
   int real;
   int imag;
    void setvalue()
   {
       cin>>real;
       cin>>imag;
   }
   void display()
   {
       cout<<real<<"+i"<<imag<<endl;
   }
   void sum(Complex c1, Complex c2)
   {
       real=c1.real+c2.real;
       imag=c1.imag+c2.imag;
   }
   };
int main()
   {
       Complex c1,c2,c3;
       c1.setvalue();
       c2.setvalue();
       c3.sum(c1,c2);
       c3.display();
   return 0;
   }