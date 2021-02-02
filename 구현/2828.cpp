#include <iostream>

using namespace std;

int main()
{
    int n, m, j, left, right, x, diff, sum = 0;
    
    cin >> n >> m >> j;
    
    left = 1;
    right = m;
    
    for(int i = 0; i < j; i++)
    {
        cin >> x;
        
        if(x < left)
        {
            diff = left - x;
            left = x;
            right -= diff;
            sum += diff;
        }
        else if(right < x)
        {
            diff = x - right;
            right = x;
            left += diff;
            sum += diff;
        }
    }
    
    cout << sum << endl;
    
    return 0;
}
