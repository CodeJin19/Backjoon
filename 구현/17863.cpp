#include <iostream>

using namespace std;

int main ()
{
    int digit;
    
    cin >> digit;
    
    digit /= 10000;
    
    if (digit == 555)
        cout << "YES\n";
    else
        cout << "NO\n";
    
    return 0;
}
