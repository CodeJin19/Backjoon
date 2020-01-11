#include <iostream>

using namespace std;

int main ()
{
    int n, r;
    
    cin >> n;
    
    r = n % 5;
    n /= 5;
    
    if(r != 0)
    {
        n ++;
    }
    
    cout << n << endl;
    
    return 0;
}
