#include <iostream>

using namespace std;

int main ()
{
    int x, n, total, p;
    
    cin >> x >> n;
    
    total = x * (n + 1);
    
    for(int i = 0; i < n; i++)
    {
        cin >> p;
        
        total -= p;
    }
    
    cout << total << endl;
}
