#include <iostream>

using namespace std;

int main ()
{
    int t, x, max, min, n;
    
    cin >> t;
    
    for(int itr = 0; itr < t; itr++)
    {
        max = -1;
        min = 100;
        
        cin >> n;
        
        for(int i = 0; i < n; i++)
        {
            cin >> x;
            
            if(max < x)
            {
                max = x;
            }
            
            if(x < min)
            {
                min = x;
            }
        }
        
        cout << 2 * ( max - min) << "\n";
    }
    
    return 0;
}
