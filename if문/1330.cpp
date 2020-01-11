#include <iostream>

using namespace std;

int main ()
{
    int a, b;
    
    cin >> a >> b;
    
    if(a == b)
    {
        cout << "==\n";
    }
    else if(b < a)
    {
        cout << ">\n";
    }
    else
    {
        cout << "<\n";
    }
    
    return 0;
}
