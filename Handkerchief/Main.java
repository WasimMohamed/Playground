#include <iostream>
#include <sstream>
#include <iomanip>
#include <vector>
#include <deque>
#include <list>
#include <set>
#include <map>
#include <stack>
#include <queue>
#include <bitset>
#include <string>
#include <numeric>
#include <algorithm>
#include <functional>
#include <iterator>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <cstdlib>
#include <cctype>
#include <complex>
#include <ctime>
#define INF 0x3f3f3f3f
#define eps 1e-6
#define p(x) printf("%d\n", x)
#define k(x) printf("Case %d: ", ++x)
#define mes(x, d) memset(x, d, sizeof(x))
#define s(x) scanf("%d", &x)
typedef long long LL;

const double pi = acos(-1.0);
const long long mod = 1e9 + 7;

using namespace std;


int main()
{
   //freopen("int.txt","r",stdin);
   //freopen("out.txt","w",stdout);
   int N;
   scanf("%d",&N);
   for(int i = 0;i < 2 * N + 1;i++)
   {
       int j = i,k;
       if(j >= N)
           j = 2 * N - i;
       for(k = 0;k < N - j;k++)
           printf("  ");
       if(j)
       {
           for(k = 0;k <= j;k++)
               printf("%d ",k);
           for(k = j - 1;k > 0;k--)
               printf("%d ",k);
       }
       puts("0");
   }
   return 0;
}