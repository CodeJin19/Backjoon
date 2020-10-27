#include <iostream>

using namespace std;

int main ()
{
    int n, w, h, l;
    
    cin >> n >> w >> h >> l;
    
    w /= l;
    h /= l;
    
    if(n < w * h)
    {
        cout << n << endl;
    }
    else
    {
        cout << w * h << endl;
    }
    
    return 0;
}
