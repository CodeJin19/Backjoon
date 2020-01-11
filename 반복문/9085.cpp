#include <iostream>

using namespace std;

int main ()
{
    int T, n, x, sum;
    
    cin >> T;
    
    for(int itr = 0; itr < T; itr++)
    {
        sum = 0;
        
        cin >> n;
        
        for(int i = 0; i < n; i++)
        {
            cin >> x;
            sum += x;
        }
        
        cout << sum << endl;
    }
    
    return 0;
}
