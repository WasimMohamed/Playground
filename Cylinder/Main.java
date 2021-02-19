
#include<iostream>
#include<cmath>
using namespace std;
int main(){
// Type your code here
 double a,b,c;
 cin>>a>>b>>c;
  if(a<0)
    a=0;
  if(b<0)
    b=0;
  if(c<0)
    c=0;
 cout<<"Circle radius: "<<a;
 cout<<"\nCircle area: "<<M_PI*a*a;
 cout<<"\nCylinder radius: "<<b;
 cout<<"\nCylinder height: "<<c;
 cout<<"\nCylinder area: "<<(M_PI*b*b);
 cout<<"\nCylinder volume: "<<M_PI*b*b*c;
return 0;
}