#include <iostream>

using namespace std;

int main()
{
    int n;
    
    cin >> n;
    
    if (198 < n)
    {
        cout << "0\n";
    }
    else
    {
        cout << 199 - n << "\n";
    }
    
    return 0;
}
