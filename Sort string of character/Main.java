
#include<bits/stdc++.h> 
using namespace std; 
  
// function to print string in sorted order 
void sortString(string &str) 
{ 
   sort(str.begin(), str.end()); 
   cout << str; 
} 
  
// Driver program to test above function 
int main() 
{ 
    string s;
    cin>>s;
    sortString(s);  
    return 0; 
}