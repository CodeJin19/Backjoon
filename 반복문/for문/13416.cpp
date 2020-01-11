#include <iostream>

using namespace std;

int main ()
{
    int t, n, x, max, sum;
    
    cin >> t;
    
    for(int itr = 0; itr < t; itr++)
    {
        sum = 0;
        
        cin >> n;
        
        for(int i = 0; i < n; i++)
        {
            max = 0;
            
            for(int j = 0; j < 3; j++)
            {
                cin >> x;
                
                if(max < x)
                {
                    max = x;
                }
            }
            
            if(0 <= max)
            {
                sum += max;
            }
        }
        
        cout << sum << endl;
    }
}
