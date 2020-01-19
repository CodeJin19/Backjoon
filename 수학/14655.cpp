#include <iostream>

using namespace std;

int main ()
{
    int n, x, sum = 0;
    
    cin >> n;
    
    for(int i = 0; i < n; i++)
    {
        cin >> x;
        
        if(0 <= x)
        {
            sum += x;
        }
        else
        {
            sum -= x;
        }
    }
    
    for(int i = 0; i < n; i++)
    {
        cin >> x;
    }
    
    cout << sum * 2 << endl;
    
    return 0;
}
