#include <iostream>

using namespace std;

int main ()
{
    int t, n;
    char c;
    
    cin >> t;
        
    for (int itr = 0; itr < t; itr++)
    {
        cin >> n >> c;
        
        for (int i = 0; i < n; i++)
        {
            cout << c;
        }
        
        cout << endl;
    }
    
    return 0;
}
