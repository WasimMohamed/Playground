#include <iostream> 
using namespace std; 
int main() 
{ 
	int n;
  int arr[10],num;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    std::cin>>arr[i];
    std::cout<<arr[i]<<"-->";
  }
  std::cout<<"\n";
  std::cin>>num;
  for(int i=1;i<=n-num;i++)
  {
    std::cout<<arr[i]<<"-->";
  }
}