#include <iostream>

using namespace std;

int main ()
{
    int n, sum;
    
    cin >> n;
    
    while(n != 0)
    {
        sum = 0;
        
        for(int i = 1; i <= n; i++)
        {
            sum += (i * i);
        }
        
        cout << sum << "\n";
        
        cin >> n;
    }
    return 0;
}
