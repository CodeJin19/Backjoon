#include <iostream>

using namespace std;

int main ()
{
    int m, d;
    
    cin >> m >> d;
    
    if(m < 2)
    {
        cout << "Before\n";
    }
    else if(m == 2)
    {
        if(d < 18)
        {
            cout << "Before\n";
        }
        else if(d == 18)
        {
            cout << "Special\n";
        }
        else
        {
            cout << "After\n";
        }
    }
    else
    {
        cout << "After\n";
    }
    
    return 0;
}
