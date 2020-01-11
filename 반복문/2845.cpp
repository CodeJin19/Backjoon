#include <iostream>

using namespace std;

int main ()
{
    int l, p, x, total;
    
    cin >> l >> p;
    
    total = l * p;
    
    for(int i = 0; i < 5; i++)
    {
        cin >> x;
        
        cout << x - total << " ";
    }
    
    return 0;
}
