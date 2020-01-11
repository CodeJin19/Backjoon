#include <iostream>

using namespace std;

int main()
{
    int x, y;
    
    cin >> x >> y;
    
    while(x != 0 && y != 0)
    {
        cout << x / y << " " << x % y << " / " << y << "\n";
        cin >> x >> y;
    }
    
    return 0;
}
