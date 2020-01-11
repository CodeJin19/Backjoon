#include <iostream>

using namespace std;

int main ()
{
    int n, m, x, max = -1, sum = 0;
    
    cin >> n >> m;
    
    for(int i = 0; i < n; i++)
    {
        cin >> x;
        
        if(max < x)
        {
            max = x;
        }
    }
    
    sum += max;
    max = -1;
    
    for(int i = 0; i < m; i++)
    {
        cin >> x;
        
        if(max < x)
        {
            max = x;
        }
    }
    
    sum += max;
    cout << sum << endl;
    
    return 0;
}
