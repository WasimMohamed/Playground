#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

// Function to reverse a string in-place in C++
void reverse(string &s)
{
	int n = s.length();

	std::string::iterator start = s.begin();
	std::string::iterator end = s.end();

	while (std::distance(start, end) > 0) {
		std::swap(*(start++), *(--end));
	}
}

// main function
int main()
{
	string s;
  cin>>s;

	reverse(s);
	cout << s;

	return 0;
}