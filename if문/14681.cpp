#include <iostream>

using namespace std;

int main ()
{
    int x, y;
    
    cin >> x >> y;
    
    if(0 < x)
    {
        if(0 < y)
        {
            cout << "1\n";
        }
        else
        {
            cout << "4\n";
        }
    }
    else
    {
        if(0 < y)
        {
            cout << "2\n";
        }
        else
        {
            cout << "3\n";
        }
    }
    
    return 0;+
}
