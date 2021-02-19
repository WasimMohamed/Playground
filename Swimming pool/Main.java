#include<iostream>
using namespace std;
class Rectangle{
 public:
 double len,wid;
 double getWidth()
 {
   return wid;
 }
 double getLength()
 {
   return len;
 }
 double getArea()
 {
   return wid*len;
 }
};
class Cuboid : public Rectangle
{
public:
double height;
Cuboid ( double a , double b , double c )
{
   len=(a<0)?0:a;
   wid=(b<0)?0:b;
   height=c;
}
double getHeight()
 {
   return height;
 }
 double getVolume()
 {
   return wid*len*height;
 }
};
int main(){
 double wid,len,height;
 cin>>len>>wid>>height;
 Cuboid C (wid,len,height);
 cout<<"Rectangle width: "<<C.getWidth()<<endl;
 cout<<"Rectangle length: "<<C.getLength()<<endl;
 cout<<"Rectangle area: "<<C.getArea()<<endl;
 cout<<"Cuboid width: "<<C.getWidth()<<endl;
 cout<<"Cuboid length: "<<C.getLength()<<endl;
 cout<<"Cuboid height: "<<C.getHeight()<<endl;
 cout<<"Cuboid volume: "<<C.getVolume()<<endl;

}