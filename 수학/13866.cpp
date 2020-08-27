#include <iostream>
#include <vector>

using namespace std;

int main ()
{
    int a, b, c, d, x;
    
    cin >> a >> b >> c >> d;
    
    x = a + d - b - c;
    
    if(x < 0)
        x = 0 - x;
    
    cout << x << endl;
    
    return 0;
}
