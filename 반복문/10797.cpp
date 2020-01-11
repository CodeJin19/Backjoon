#include <iostream>

using namespace std;

int main ()
{
    int n, x;
    int cnt = 0;
    
    cin >> n;
    
    for(int i = 0; i < 5; i++)
    {
        cin >> x;
        
        if(x == n)
        {
            cnt++;
        }
    }
    
    cout << cnt << endl;
    
    return 0;
}
